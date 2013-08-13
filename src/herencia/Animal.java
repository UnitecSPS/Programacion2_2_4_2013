/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Gotcha
 */
public abstract class Animal {
    protected String raza;
    protected int patas;
    
    public Animal(String r, int p){
        raza = r;
        patas = p;
    }

    @Override
    public String toString() {
        return "{" + "raza=" + raza + ", patas=" + patas + '}';
    }

    public final String getRaza() {
        return raza;
    }

    public final int getPatas() {
        return patas;
    }
    
    public abstract void habla();
}
