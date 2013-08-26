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
public class Granja {
    public static void main(String[] args) {
        try{
            aves();
        }catch(PatitoException pat){
            System.out.println("ERROR: " + pat.getMessage());
        }
    }

    private static void aves()throws PatitoException, NullPointerException {
        Scanner lea = null;
        String ave = lea.next();
        
        if( !ave.equals("patito")){
            PatitoException e = new PatitoException();
            throw e;
        }
        
    }
}
