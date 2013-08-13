/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Gotcha
 */
public interface Interneteable {
    //atributos
    int VERSION = 123, TEST= 3;
    
    //funciones
    String getIp();
    void makeConection();
    void setIp(String ip);
}
