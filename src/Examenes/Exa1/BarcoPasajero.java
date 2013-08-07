/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examenes.Exa1;

import java.util.Scanner;

/**
 *
 * @author Gotcha
 */
public class BarcoPasajero extends Barco {
    private String pasajeros[];
    private int cont;
    private double precio;
    
    public BarcoPasajero(String n,int max,int pre){
        super(n);
        pasajeros = new String[max];
        cont = 0;
        precio = pre;
    }
    
    @Override
    public void agregarElemento(){
        Scanner lea = new Scanner(System.in);
        if( cont < pasajeros.length ){
            pasajeros[cont] = lea.next();
            cont++;
        }
    }
    
    @Override
    public double vaciarCobrar(){
        double tot = cont * precio;
        cont = 0;
        return tot;
    }
    
    @Override
    public String toString(){
        return super.toString() + " #Pasaje: " + cont;
    }
    
    public void listarPasajeros(){
        for(int p=0 ; p < cont; p++){
            System.out.println(pasajeros[p]);
        }
    }
}
