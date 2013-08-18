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
