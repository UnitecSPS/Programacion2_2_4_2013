/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/**
 *
 * @author Gotcha
 */
public enum LINA {
    VIDA(2), VICTORIA(1), OLIMPIA(23), MOTAGUA(13);
    
    int copas;
    
    LINA(int copas){
        this.copas = copas;
    }
}
