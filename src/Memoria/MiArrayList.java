/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Memoria;

/**
 *
 * @author Gotcha
 *
 */
public class MiArrayList {

    Nodo inicio = null;

    public void add(Nodo obj) {
        if (inicio == null) {
            inicio = obj;
        } else {
            Nodo ultimo = inicio;

            while (ultimo.siguiente != null) {
                ultimo = ultimo.siguiente;
            }
            ultimo.siguiente = obj;
        }
        listar();
    }

    public void listar() {
        Nodo tmp = inicio;
        System.out.println("\n\nLISTADO DE NODOS\n-----------");
        while (tmp != null) {
            System.out.println("-" + tmp.nombre);
            tmp = tmp.siguiente;
        }
    }

    public boolean delete(String nombre) {
        if (inicio != null) {
            if (inicio.nombre.equals(nombre)) {
                inicio = inicio.siguiente;
                return true;
            } else {
                Nodo tmp = inicio;
                while (tmp.siguiente != null) {
                    if (tmp.siguiente.nombre.equals(nombre)) {
                        tmp.siguiente = tmp.siguiente.siguiente;
                        return true;
                    }
                    tmp = tmp.siguiente;
                }
            }
        }
        return false;
    }

    public boolean contains(String nombre) {
        Nodo tmp = inicio;

        while (tmp != null) {
            if (tmp.nombre.equals(nombre)) {
                return true;
            }
            tmp = tmp.siguiente;
        }
        return false;
    }
}
