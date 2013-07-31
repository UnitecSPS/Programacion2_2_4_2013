/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author Gotcha
 */
public class PrestamoAuto extends Prestamo {
    private double montoSeguro;
    
    public PrestamoAuto(double mt, String c,double ms){
        super(mt,c);
        montoSeguro = ms;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println(montoSeguro);
    }
    
    @Override
    public void pagar(double m){
        montoTotal -= m / 2;
        montoSeguro -= m / 2;
    }
}
