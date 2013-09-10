/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package binario;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gotcha
 */
public class SuperMarket {
    private RandomAccessFile productos;
    private RandomAccessFile codigos;
    private String dirfactura = "supermarket/facturas";
    private Scanner lea = new Scanner(System.in);
    
    public SuperMarket(){
        creardirs();
        try{
            productos = new RandomAccessFile("supermarket/productos.smk", "rw");
            codigos = new RandomAccessFile("supermarket/codigos.smk", "rw");
            initcodsfile();
        }
        catch(IOException io){
            System.out.println("ERROR: " + io.getMessage());
        }
    }

    private void creardirs() {
        File f = new File("supermarket/facturas");
        f.mkdirs();
    }

    private void initcodsfile() throws IOException{
        if(codigos.length() == 0){
            codigos.writeInt(1);
            codigos.writeInt(1);
        }
    }
    
    private int getCodigo(int offset)throws IOException{
        codigos.seek(offset);
        int codigo = codigos.readInt();
        codigos.seek(offset);
        codigos.writeInt(codigo+1);
        return codigo;
    }
    
    private int getNewCodProducto()throws IOException{
        return getCodigo(0);
    }
    
    private int getNewCodFactura()throws IOException{
        return getCodigo(4);
    }
   
    public void addProducto()throws IOException{
        productos.seek( productos.length() );
        
        //nombre
        System.out.println("Nombre: ");
        String nom = lea.next();
        //precio venta
        System.out.println("Precio Venta: ");
        double precv = lea.nextDouble();
        //precio compra
        System.out.println("Precio Compra: ");
        double precc = lea.nextDouble();
        //cantidad
        System.out.println("Cantidad: ");
        int cant = lea.nextInt();
        //tipo
        System.out.println("Tipo: ");
        TipoProducto tp = TipoProducto.valueOf(lea.next().toUpperCase());
        
        
        //a escribir
        productos.writeInt(getNewCodProducto());
        productos.writeUTF(nom);
        productos.writeDouble(precv);
        productos.writeDouble(precc);
        productos.writeInt(cant);
        productos.writeUTF(tp.name());
    }
    
    public void inventario()throws IOException{
        productos.seek(0);
        System.out.println("\n\nINVENTARIO\n----------");
        while(productos.getFilePointer() < productos.length()){
            int cod = productos.readInt();
            String n = productos.readUTF();
            double pv = productos.readDouble();
            double pc = productos.readDouble();
            int cant = productos.readInt();
            String tipo = productos.readUTF();
            
            System.out.printf("%d- %s Venta: Lps. %.2f Compra %.2f Cantidad: %d - %s\n",
                    cod,n,pv,pc,cant,tipo);
        }
    }
    
    public boolean search(int cod)throws IOException{
        productos.seek(0);
        
        while(productos.getFilePointer() < productos.length()){
            int code = productos.readInt();
            long pos = productos.getFilePointer();
            productos.readUTF();
            productos.seek(productos.getFilePointer()+16);
            int cant = productos.readInt();
            productos.readUTF();
            
            if(code==cod && cant > 0){
                productos.seek(pos);
                return true;
            }
        }
        
        return false;
    }
    
    public void generarCompra()throws IOException{
        ArrayList<LineItem> items = new ArrayList<>();
        char resp;
        System.out.println("Cliente: ");
        String cli = lea.next();
        
        do{
            System.out.println("Codigo producto: ");
            int cp = lea.nextInt();
            
            if(search(cp)){
                System.out.println(productos.readUTF());
                double pv = productos.readDouble();
                productos.readDouble();
                System.out.println("Cantidad: ");
                int cant = lea.nextInt();
                int cap = productos.readInt();
                if(cant <= cap){
                    //continuar
                    items.add(new LineItem(cp, cant, pv));
                }
                else
                    System.out.println("SOLO TENEMOS " + cap);
            }
            else{
                System.out.println("Producto no existe o agotado");
            }
            
            System.out.print("Quiere otro? (s/n): ");
            resp = lea.next().charAt(0);
        }while(resp == 's');
        
        if( items.size() > 0)
            crearFactura(cli, items);
    }

    private void crearFactura(String cli, ArrayList<LineItem> items) {
        
    }
    
}
