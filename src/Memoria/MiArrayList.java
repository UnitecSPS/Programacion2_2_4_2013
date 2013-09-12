/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Memoria;

/**
 *
 * @author Gotcha
 */
public class MiArrayList {
    Nodo inicio = null;
    
    public void add(Nodo obj){
        if( inicio == null ){
            inicio = obj;
        }
        else{
            Nodo ultimo = inicio;
            
            while(ultimo.siguiente != null ){
                ultimo = ultimo.siguiente;
            }
            ultimo.siguiente = obj;
        }
    }
}
