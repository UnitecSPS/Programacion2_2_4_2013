/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examenes.Exa2;

/**
 *
 * @author Gotcha
 */
public final class GameForRent extends ItemForRent implements iScore {
    int acumScore, contScore;
    
    public GameForRent(String n, int cod, int co){
        super(n,cod,co);
        acumScore = 0;
        contScore = 0;
    }
    
    @Override
    public double generarRenta(int d) {
        if( d > 3 )
            return d * 20;
        throw new InvalidDaysException();
    }

    @Override
    public TipoItem getTipoItem() {
        return TipoItem.GAME;
    }

    @Override
    public void addScore(int score) {
        acumScore += score;
        contScore++;
    }

    @Override
    public double getScore() {
        if( contScore > 0)
            return acumScore/contScore;
        return 0;
    }
    
}
