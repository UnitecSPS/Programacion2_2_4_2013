/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author Gotcha
 */
public class Prestamo {
    protected double montoTotal;
    protected String nombre;
    
    public Prestamo(double mt, String n){
        montoTotal = mt;
        nombre = n;
    }
    
    public void pagar(double monto){
        montoTotal -= monto;
    }
    
    public void imprimir(){
        System.out.println(montoTotal + nombre);
    }
}
