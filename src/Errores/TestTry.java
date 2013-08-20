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
public class TestTry {
    public static void main(String[] args) {
        try{
            patito();
        }
        catch(InputMismatchException e){
            System.out.println("Ingrese un valor correcto");
        }
        catch(ArithmeticException e){
            System.out.println("No dividas entre 0! OK!");
        }
        catch(Exception e){
            System.out.println("Error: " +e.getMessage());
            e.printStackTrace();
        }
        
        System.out.println("Terminando el main");
    }

    private static void patito() {
        pollito();
        System.out.println("Terminando patito");
    }

    private static void pollito() {
        Scanner lea = new Scanner(System.in);
        int arr[] = {1,2,3};
        int y = lea.nextInt();
        int x = 5/y;
        System.out.println(arr[y]);
        System.out.println("Terminando pollito");
    }
}
