
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
        
        Calendar ca = new Calendar() {

            @Override
            protected void computeTime() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            protected void computeFields() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void add(int field, int amount) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void roll(int field, boolean up) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public int getMinimum(int field) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public int getMaximum(int field) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public int getGreatestMinimum(int field) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public int getLeastMaximum(int field) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
    }
}
