package org.example.javaiterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Loop {
    public static void main(String[] args) {
        ArrayList<String>cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("Honda");
        Iterator<String> it = cars.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
