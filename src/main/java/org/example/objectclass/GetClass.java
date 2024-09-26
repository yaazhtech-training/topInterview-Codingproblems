package org.example.objectclass;
import java.util.GregorianCalendar;

public class GetClass {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        {
            System.out.println(cal.getTime());
        }{
            System.out.println(cal.getClass());
        }

    }
}
