/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Memoria;

/**
 *
 * @author Gotcha
 */
public class Nodo {
    public String nombre;
    public Nodo siguiente;
    public Nodo anterior;
    
    public Nodo(String nombre) {
        this.nombre = nombre;
        siguiente = null;
        anterior = null;
    }
    
    
}
