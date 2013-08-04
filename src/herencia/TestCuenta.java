/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.ArrayList;
import java.util.Date;

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
        cuentas.add(new CuentaPlazoFijo(4,"Rfaa",new Date()));
        
        for(CuentaBancaria cb : cuentas){
            if( cb instanceof CuentaAhorro ){
                ((CuentaAhorro)cb).registrarIntereses();
            }
            else if( cb instanceof CuentaCheques){
                cb.retiro(30);
                cb.retiro(50);
                CuentaCheques ch = (CuentaCheques)cb;
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
