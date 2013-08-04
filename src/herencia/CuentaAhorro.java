/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Gotcha
 */
public class CuentaAhorro extends CuentaBancaria {
    protected double tasa;
    
    public CuentaAhorro(int n, String c, double tas){
        super(n,c);
        tasa = tas;
        
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }
    
    public void registrarIntereses(){
        System.out.println("Registrar Int. en ahorro");
        deposito( tasa * saldo );
    }
    
    @Override
    public String toString(){
        return super.toString() + " tasa=" + tasa;
    }
    
    //programacion incremental
    @Override
    public void imprimir(){
        System.out.println("\nDATOS CLIENTE\n-------");
        System.out.println(this);
    }

    @Override
    public void soy() {
        System.out.println("CUENTA AHORRO");
    }
    
    
}
