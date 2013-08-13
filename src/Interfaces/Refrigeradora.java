/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Gotcha
 */
public class Refrigeradora implements Interneteable {

    @Override
    public String getIp() {
        return "1.2.3.4";
    }

    @Override
    public void makeConection() {
        System.out.println("Refri is Connected");
    }

    @Override
    public void setIp(String ip) {
        System.out.println(ip + " setup");
    }
    
}
