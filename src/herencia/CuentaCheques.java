/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.ArrayList;
import java.util.Scanner;

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

    private int numCheque(){
        return cheques.isEmpty() ? 1 : (cheques.get(cheques.size()-1) + 1);
    }
    
    @Override
    public boolean retiro(double monto) {

        if( super.retiro(monto) ){
            addCheque(numCheque());
            return true;
        }
        return false;
    }
  
    private void addCheque(int nc){
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
