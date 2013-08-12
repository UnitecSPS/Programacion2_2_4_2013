/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Gotcha
 */
public class Gallina extends Animal {
    public Gallina(){
        super("gallina",2);
    }

    @Override
    public void habla() {
        System.out.println("clo clo clo");
    }
    
    
}
