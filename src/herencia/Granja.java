/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.ArrayList;

/**
 *
 * @author Gotcha
 */
public class Granja {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        
        animales.add( new Pitbull() );
        animales.add( new Gallina() );
        animales.add( new Pollo() );
        animales.add( new Conejo() );
        
        for(Animal ani : animales)
            ani.habla();
        
        
        ///On demand
        Animal ani = new Animal("Monstruo", 2){
            public void test(){
                System.out.println("LLAMANDO FUNCION BAJO DEMANDA");
            }
            
            @Override
            public void habla(){
                test();
                System.out.println("Grr rgG gGGrer");
            }
        };
        
        Gallina gallo = new Gallina(){
            @Override
            public void habla(){
                System.out.println("Kikiriki Kikiriki");
            }
        };
        gallo.habla();
        ani.habla();
        
    }
}
