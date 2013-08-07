/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examenes.Exa1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gotcha
 */
public class Puerto {
    ArrayList<Barco> barcos;
    
    public Puerto(){
        barcos = new ArrayList<>();
    }
    
    public Barco buscar(String n){
        for(Barco b : barcos){
            if( b.getNombre().equals(n))
                return b;
        }
        return null;
    }
    
    public void agregarBarco(int tipo){
        Scanner lea = new Scanner(System.in);
        String nom = lea.next();
        
        if( buscar(nom) == null ){
            if( tipo == 0 ){
                barcos.add( new BarcoPesquero(nom));
            }
            else if(tipo == 1){
                int max = lea.nextInt();
                int prec = lea.nextInt();
                barcos.add( new BarcoPasajero(nom, max, prec));
            }
            else{
                System.out.println("TIPO INCORRECTO");
            }
        }
    }
    
    public void agregarElemento(String nom){
        Barco b = buscar(nom);
        if( b != null ){
            b.agregarElemento();
        }
        /*for(Barco ba : barcos){
            if( ba.getNombre().equals(nom)){
                ba.agregarElemento();
            }
        }*/
    }
    
    public void vaciar(String nom){
        vaciar(nom,0);
    }

    private double vaciar(String nom, int pos) {
        if( pos < barcos.size() ){
            Barco b = barcos.get(pos);
            if( b.getNombre().equals(nom) ){
                System.out.println(b);
                return b.vaciarCobrar();
            }
            return vaciar(nom, pos + 1);
        }
        return 0;
    }
    
    public void listarPasajeros(){
        listarPasajeros(0);
    }

    private void listarPasajeros(int pos) {
        if( pos < barcos.size() ){
            Barco b = barcos.get(pos);
            if( b instanceof BarcoPasajero ){
                ((BarcoPasajero)b).listarPasajeros();
            }
            listarPasajeros(pos+1);
        }
    }
    
    public void agregarCardumen(String nom,int cant){
        Barco b = buscar(nom);
        if( b != null ){
            if( b instanceof BarcoPesquero ){
                ((BarcoPesquero)b).agregarCardumen(cant);
            }
        }
    }
    
    public void listar(){
        for(Barco b : barcos){
            System.out.println(b);
        }
    }
    
}
