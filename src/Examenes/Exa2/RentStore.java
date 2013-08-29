/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examenes.Exa2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gotcha
 */
public class RentStore {
    ArrayList<ItemForRent> items;
    Scanner lea = new Scanner(System.in);
    
    public RentStore(){
        items = new ArrayList<>();
    }
    
    public void addItem(TipoItem it){
        String nom = lea.next();
        int cod = lea.nextInt();
        int co = lea.nextInt();
        
        switch(it){
            case MOVIE:
                String ms = lea.next();
                MovieStatus mst = MovieStatus.valueOf(ms);
                
                items.add(new MovieForRent(nom, cod, co, mst));
                break;
            case GAME:
                items.add(new GameForRent(nom, cod, co));
        }
    }
    
    public ItemForRent buscar(int cod){
       for(ItemForRent item : items){
           if(item.codigo == cod)
               return item;
       } 
       return null;
    }
    
    public double rentar(int cod)throws Exception{
        ItemForRent item = buscar(cod);
        
        if(item != null){
            try{
                if( item.copias > 0 )
                    return item.generarRenta(lea.nextInt());
                throw new Exception();
            }
            catch(InvalidDaysException e){
                System.out.println(e.getMessage());
            }
        }
        
        return 0;
    }
    
    public void agregarActores(int cod){
        ItemForRent item = buscar(cod);
        
        if( item instanceof MovieForRent){
            int cant = lea.nextInt();
            for(int c=0; c < cant; c++){
                ((MovieForRent)item).ingresarActor(lea.next());
            }
        }
        
    }
    
    public void addScore(int cod){
        ItemForRent item = buscar(cod);
        
        if( item instanceof GameForRent ){
            int score = lea.nextInt();
            
            if( score >=0 && score <= 5)
                ((GameForRent)item).addScore(score);
            else
                throw new RuntimeException("Score Invalido");
        }
    }
    
    public void listar(){
        int cm = 0, cg = 0;
        for(ItemForRent item : items){
            System.out.println(item);
            
            if( item instanceof MovieForRent)
                cm++;
            else
                cg++;
        }
        System.out.println(cm);
        System.out.println(cg);
    }
}
      