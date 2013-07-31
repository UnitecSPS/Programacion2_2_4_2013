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
    private double tasa;
    
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
        deposito( tasa * saldo );
    }
    
    //programacion incremental
    @Override
    public void imprimir(){
        System.out.println("\nDATOS CLIENTE\n-------");
        super.imprimir();
        System.out.println(" Tasa: "  + tasa);
    }

    @Override
    public void soy() {
        System.out.println("CUENTA AHORRO");
    }
    
    
}
