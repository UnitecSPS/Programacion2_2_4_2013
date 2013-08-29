/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Gotcha
 */
public class FileTest {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        System.out.println("Ingrese dir abstracta o absoluta: ");
        File file = new File(lea.next());
        char op;
        
        if( file.exists() ){
            System.out.println("YA EXISTE");
            System.out.println("Lo quiere borrar?: (s/n) ");
            op = lea.next().charAt(0);
            
            if( Character.toUpperCase(op) == 'S'){
                if( file.delete() )
                    System.out.println("Removido exitosamente");
            }
        }
        else{
            System.out.println("NO EXISTE");
            
            System.out.println("Quiere archivo o directio (a/d): ");
            op = lea.next().charAt(0);
            
            if( Character.toUpperCase(op) == 'A'){
               try{
                  if( file.createNewFile() )
                       System.out.println("Creacion de archivo exitosa");
                  else
                       System.out.println("No se pudo crear archivo");
               }
               catch(IOException e){
                   System.out.println("Error io: " + e.getMessage());
               }
            }
            else{
                if( file.mkdir() )
                    System.out.println("Creacion de directorio exitosa");
                else
                    System.out.println("No se pudo crear directorio");
            }
        }
        
    }
}
