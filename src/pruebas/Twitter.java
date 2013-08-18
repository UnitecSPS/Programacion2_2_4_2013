/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author Gotcha
 */
public final class Twitter extends RedSocial implements IVerify {
    private boolean verified;
    
    public Twitter(String u, boolean v){
        super(u);
        verified = v;
    }
    
    @Override
    public void imprimir(){
        System.out.println(user);
        for(String post : posts){
            System.out.println(post);
        }
    }
    
    @Override
    public String label(){
        if( verified )
            return "VERIFICADO";
        return "";
    }
}
