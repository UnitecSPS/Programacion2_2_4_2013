/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examenes.Exa1;

/**
 *
 * @author Gotcha
 */
public class BarcoPesquero extends Barco {
    private int capturados;
    public static double PRECIO_X_PESCADO = 10;
    
    public BarcoPesquero(String n){
        super(n);
        capturados = 0;
    }
    
    @Override
    public void agregarElemento(){
        capturados++;
    }
    
    @Override
    public double vaciarCobrar(){
        double total = capturados * PRECIO_X_PESCADO;
        capturados = 0;
        return total;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Capturados: " + capturados;
    }
    
    public void agregarCardumen(int cant){
        capturados += cant;
    }
}
