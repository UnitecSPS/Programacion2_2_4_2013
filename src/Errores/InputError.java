/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Errores;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gotcha
 */
public class InputError {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        do{
            try{
                int num = lea.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.println("Valor NO ES NUMERO");
                lea.next();
            }
        }while(true);
    }
}
