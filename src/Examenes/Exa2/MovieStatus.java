/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examenes.Exa2;

/**
 *
 * @author Gotcha
 */
public enum MovieStatus {
    ESTRENO(25), NORMAL(20), KIDS(10);
    int precio;

    private MovieStatus(int prec) {
        precio = prec;
    }
    
}
