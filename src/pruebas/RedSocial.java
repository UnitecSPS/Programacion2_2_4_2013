/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.ArrayList;

/**
 *
 * @author Gotcha
 */
public abstract class RedSocial {
    protected String user;
    protected ArrayList<String> posts;
    
    public RedSocial(String u){
        user = u;
        posts = new ArrayList<>();
    }
    
    public final void addPost(String txt){
        posts.add(txt);
    }
   
    public abstract void imprimir();
}
