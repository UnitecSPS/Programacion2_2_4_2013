
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gotcha
 */
public class Calendario {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if( c instanceof GregorianCalendar){
            System.out.println("SI ES UN GREGORIAN");
        }
    }
}
