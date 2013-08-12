/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examenes.Exa1;

/**
 *
 * @author Gotcha
 */
public abstract class Barco {
        protected String nombre;

    public Barco(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Barco{" + "nombre=" + nombre + '}';
    }

    public String getNombre() {
        return nombre;
    }
        
    public abstract void agregarElemento();
    public abstract double vaciarCobrar();
}
