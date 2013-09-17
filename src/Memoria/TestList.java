/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Memoria;

/**
 *
 * @author Gotcha
 */
public class TestList {
    public static void main(String[] args) {
        MiArrayList mlist = new MiArrayList();
        
        mlist.add(new Nodo("Lilian"));
        mlist.add(new Nodo("Fabian"));
        mlist.add(new Nodo("Luis"));
        mlist.add(new Nodo("Jose"));
        mlist.add(new Nodo("Yogui"));
        
        mlist.delete("Lilian");
        mlist.delete("Luis");
        mlist.delete("Yogui");
        mlist.delete("Rafa");
        
        System.out.println("\nLISTA DESPUES DE BORRAR");
        mlist.listar();
    }
}
