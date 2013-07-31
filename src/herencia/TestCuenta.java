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
public class TestCuenta {
    public static void main(String[] args) {
        ArrayList<CuentaBancaria> cuentas = new ArrayList<>();
        cuentas.add(new CuentaBancaria(1,"Carlos"));
        cuentas.add(new CuentaAhorro(2,"Fabian",0.02));
        cuentas.add(new CuentaCheques(3,"Lilian"));
        
        for(CuentaBancaria cb : cuentas){
            if( cb instanceof CuentaAhorro ){
                ((CuentaAhorro)cb).registrarIntereses();
            }
            else if( cb instanceof CuentaCheques){
                CuentaCheques ch = (CuentaCheques)cb;
                ch.addCheque(1);
                ch.addCheque(2);
                ch.cantCheques();
            }
            cb.imprimir();
        }
        
        //UPCASTING
        CuentaBancaria cb = new CuentaAhorro(3,"Luis",0.03);
        //DOWNCASTING
        //   indirecta
        CuentaAhorro ca = (CuentaAhorro)cb;
        ca.registrarIntereses();
        cb.imprimir();
        //    directa
        ((CuentaAhorro)cb).registrarIntereses();
        cb.imprimir();
    }
}
