/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Gotcha
 */
public class Conejo extends Animal {
    public Conejo(){
        super("Conejo",4);
    }

    @Override
    public void habla() {
        System.out.println("shic shic shic");
    }
    
    
}
