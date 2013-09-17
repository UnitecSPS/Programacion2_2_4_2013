
import java.util.Calendar;
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gotcha
 */
public class Fecha {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2014, Calendar.JANUARY, 1);
        //milis
        c.getTimeInMillis();
        System.out.println(c.getTime());
        
        
    }
}
