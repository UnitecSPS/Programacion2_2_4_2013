/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.ArrayList;

/**
 *
 * @author Gotcha
 */
public class CuentaCheques extends CuentaBancaria {
    private ArrayList<Integer> cheques;
    
    public CuentaCheques(int n, String c){
        super(n,c);
        cheques = new ArrayList<>();
    }
    
    public void addCheque(int nc){
        cheques.add(nc);
    }
    
    public void cantCheques(){
        System.out.println("Cant: " + cheques.size());
    }

    @Override
    public void soy() {
        System.out.println("CUENTA CHEQUES");
    }
    
    
}
