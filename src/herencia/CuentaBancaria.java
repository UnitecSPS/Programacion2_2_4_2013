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
public class CuentaBancaria {
    protected int numero;
    protected String cliente;
    protected double saldo;
    protected Date apertura;
    
    public CuentaBancaria(double montomin){
        saldo = montomin;
    }
    
    public CuentaBancaria(int n, String c){
        this(500);
        numero = n;
        cliente = c;
    }

    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public Date getApertura() {
        return apertura;
    }
    
    public void deposito(double monto){
        saldo += monto;
    }
    
    public boolean retiro(double monto){
        if( monto < saldo ){
            saldo -= monto;
            return true;
        }
        return false;
    }
    
    public void imprimir(){
        System.out.print("Numero: " + numero +
                " Cliente: " + cliente + " Saldo: " + 
                saldo);
         
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numero=" + numero + ", cliente=" + cliente + ", saldo=" + saldo + ", apertura=" + apertura + '}';
    }
    
    public void soy(){
        System.out.println("CUENTA BANCARIA");
    }
}
