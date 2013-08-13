/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Gotcha
 */
public class Computadora implements Interneteable  {
    String ip;
    
    public Computadora(String i){
        ip = i;
    }
    
    @Override
    public String getIp() {
        return ip;
    }

    @Override
    public void makeConection() {
        System.out.println("Compu Connected");
    }

    @Override
    public void setIp(String ip) {
        this.ip = ip;
    }
    
}
