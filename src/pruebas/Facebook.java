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
public class Facebook extends RedSocial implements IVerify, IComment {
    
    ArrayList<Comment> comments;
    
    public Facebook(String u){
        super(u);
        comments = new ArrayList<>();
    }
    
    @Override
    public void imprimir() {
        System.out.println("User: " + user);
        
        for(int p=0; p < posts.size(); p++){
            System.out.println(posts.get(p));
            commentsFor(p);
        }
    }

    @Override
    public String label() {
        return "FB Verified";
    }

    @Override
    public void addComment(Comment com) {
        if( com.getNumPost() < posts.size() ){
            comments.add(com);
        }
    }

    private void commentsFor(int p) {
        for(Comment com : comments){
            if( com.getNumPost() == p ){
                System.out.println("\t-" + com);
            }
        }
    }
    
}
