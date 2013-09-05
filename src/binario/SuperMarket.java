/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package binario;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
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
   
    private void addProducto()throws IOException{
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
    
}
