/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examenes.Exa2;

import java.util.ArrayList;

/**
 *
 * @author Gotcha
 */
public final class MovieForRent extends ItemForRent {
    private ArrayList<String> actores;
    private MovieStatus ms;
    
    public MovieForRent(String n,int cod,int co,MovieStatus m){
        super(n,cod,co);
        actores = new ArrayList<>();
        ms = m;
    }

    @Override
    public double generarRenta(int d) {
        copias--;
        return ms.precio * d;
    }

    @Override
    public TipoItem getTipoItem() {
        return TipoItem.MOVIE;
    }
    
    public final void ingresarActor(String act){
        actores.add(act);
    }
    
    @Override
    public String toString(){
        return super.toString() + " Status: " + ms;
    }
}
