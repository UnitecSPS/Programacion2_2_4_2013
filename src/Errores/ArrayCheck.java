/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Errores;

import java.util.Scanner;

/**
 *
 * @author Gotcha
 */
public class ArrayCheck {
    public static void main(String[] args) {
        int enteros[] = new int[10];
        String resp;
        Scanner lea = new Scanner(System.in);
        
        do{
            try{
                System.out.println("Valor: ");
                int valor = lea.nextInt();
                System.out.println("Pos: ");
                int pos = lea.nextInt();
                
                enteros[pos] = valor;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Posicion incorrecta");
            }
            catch(Exception e){
                System.out.println("ERROR");
            }
            
            resp = lea.next();
        }while( resp.equals("SI"));
        
    }
}
