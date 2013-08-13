/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.ArrayList;

/**
 *
 * @author Gotcha
 */
public class WWW {
    public static void main(String[] args) {
        Interneteable it = new Computadora("122.33.233.33");
        Interneteable ref = new Refrigeradora();
        
        ArrayList<Interneteable> devices = new ArrayList<>();
        
        devices.add(it);
        devices.add(ref);
        
        for(Interneteable i : devices){
            i.makeConection();
        }
    }
}
