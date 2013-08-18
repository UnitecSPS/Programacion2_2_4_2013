/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Gotcha
 */
public abstract class Phone {
    protected int num;

    public Phone(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Phone{" + "num=" + num + '}';
    }
    
    public abstract void makeCall(int numd);
}
