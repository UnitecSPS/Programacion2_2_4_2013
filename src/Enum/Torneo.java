/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

import java.util.Scanner;

/**
 *
 * @author Gotcha
 */
public class Torneo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ClaseMia.Tipo e;
        
        try{
            LINA equipo = LINA.valueOf(sc.next().toUpperCase());
       
            System.out.println("Equipo: " + equipo +
                    " copas: " + equipo.copas);
        }
        catch(IllegalArgumentException e){
            System.out.println("TIPO INCORRECTO VO!");
        }
        
    }
}
