/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Memoria;

import java.util.Scanner;

/**
 *
 * @author Gotcha
 */
public class PrincipioBasico {
    public static void main(String[] args) {
        Nodo a = new Nodo("Carlos");
        Nodo b = a;
        b.nombre = "Andrew";
        System.out.println("a: " + a.nombre);
        System.out.println("b: " + b.nombre);
        Scanner lea = new Scanner(System.in);
        String x = "luis";
        String y = "luis";
        
        if( x == y ){
            System.out.println("cadenas iguales");
        }
        else{
            System.out.println("cadenas no iguales");
        }
        
        
        //prueba
        Nodo c = new Nodo("Fabian");
        a.siguiente = c;
        c.anterior = a;
        System.out.println("nomb: " + a.siguiente.nombre);
        System.out.println("nomb: " + c.anterior.nombre);
    }
}
