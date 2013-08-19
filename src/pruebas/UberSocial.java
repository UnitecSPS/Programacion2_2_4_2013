/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gotcha
 */
public class UberSocial {
    
    static ArrayList<RedSocial> redes = new ArrayList<>();
   
    /*
     * 
     * 1- AgregarRed(TipoRed tipo)
     *      = Agregan una cuenta segun su tipo. Los valores
     *        necesarios se piden de teclado. NO pueden
     *       haber 2 usuarios identicos
     * 2- AgregarPost(String user, String post)
     *      = Agrega un nuevo post en una cuenta segun el 
     *      usuario EXISTENTE
     * 3- AgregarComentario(String User,int post,String comm)
     *      = Agrega un nuevo comentario segun el usuario
     *      Se valida que la cuenta de ese usuario sea de tipo
     *      Facebook
     * 4- Imprimir(String User)
     *      = Imprime los datos de la cuenta segun el User
     *      existente
     * 5- lista()
     *      = Imprime el listado de redes con el formato
     *      USER - TIPO DE RED
     * 
     *    
     * 
     */
    
    public static RedSocial buscar(String u){
        for(RedSocial rs : redes){
            if( rs.user.equals(u))
                return rs;
        }
        return null;
    }
    
    public static void agregarRed(TipoRed red){
        Scanner lea = new Scanner(System.in);
        System.out.print("Ingrese Usuario: ");
        String user = lea.next();
        
        if( buscar(user) == null ){
            switch(red){
                case FACEBOOK:
                    redes.add(new Facebook(user));
                    break;
                case TWITTER:
                    redes.add(new Twitter(user, false));
            }
        }
    }
    
    public static void agregarPost(String user, String post){
        RedSocial rs = buscar(user);
        
        if( rs != null )
            rs.addPost(post);
    }
    
    public static void agregarComentario(String user,int post,String com){
        RedSocial rs = buscar(user);
        if( rs instanceof Facebook){
            ((Facebook)rs).addComment(new Comment(post,com));
        }
    }
    
    public static void imprimir(String user){
        RedSocial rs = buscar(user);
        
        if( rs != null )
            rs.imprimir();
    }
    
    public static void listar(){
        for(RedSocial rs : redes){
            System.out.print("* User: " + rs.user);
            if( rs instanceof Facebook)
                System.out.println(" [FACEBOOK]");
            else
                System.out.println(" [TWITTER]");
        }
    }
    
    public static void main(String[] args) {
        
        prueba();
       
        
    }

    private static void prueba() {
        Facebook fb = new Facebook("Fabian Mars");
        
        fb.addPost("Hoy estrene mi nueva Cancion");
        fb.addPost("Hoy no desayune");
        
        fb.addComment(new Comment(1,"Comprate una baleada"));
        fb.addComment(new Comment(0,"Ta masisa tu cancion vo"));
        fb.addComment(new Comment(0,"Gracias"));
        fb.addComment(new Comment(0,"Bla bLa"));
        
        fb.imprimir();
    }
}
