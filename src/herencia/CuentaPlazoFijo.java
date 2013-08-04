/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Date;

/**
 *
 * @author Gotcha
 */
public class CuentaPlazoFijo extends CuentaAhorro {
    private Date fechafin;
    private double intereses=0;
    
    public CuentaPlazoFijo(int n, String c, Date fin){
        super(n,c,0.1);
        fechafin = fin;
    }

    @Override
    public void registrarIntereses() {
        System.out.println("Registrar Int. en Plazo Fijo");
        Date now = new Date();
        if( now.before(fechafin) )
            intereses += saldo * tasa;
    }
    
    @Override
    public boolean retiro(double monto) {
        if( intereses > monto ){
            intereses -= monto;
            return true;
        }
        return false;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("FIn= " + fechafin + 
                " iNTERESES=" + intereses);
    }
    
    
    
}
