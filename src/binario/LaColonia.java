/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package binario;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gotcha
 */
public class LaColonia {
    public static void main(String[] args) {
        SuperMarket sm = new SuperMarket();
        int op=0;
        Scanner lea = new Scanner(System.in);
        
        do{
            System.out.println("1- Agregar Producto");
            System.out.println("2- Inventario");
            System.out.println("3- Facturar");
            System.out.println("7- SALIR");
            System.out.println("\nEscoja opcion: ");
            
            try{
                op = lea.nextInt();

                switch(op){
                    case 1:
                        sm.addProducto();
                        break;
                    case 2:
                        sm.inventario();
                        break;
                    case 3:
                        sm.generarCompra();
                }
            }
            catch(IOException e){
                System.out.println("Error de Archivo: " + e.getMessage());
            }
            catch(InputMismatchException e){
                System.out.println("Dato Incorrecto");
                lea.next();
            }
            catch(Exception e){
                System.out.println("ERROR: " + e.getMessage());
            }
        }while(op !=7);
        
    }
}
