package org.example.javaiterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String>cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Honda");
        cars.add("Ford");
        cars.add("Mazda");
        Iterator <String> it = cars.iterator();
        System.out.println(it.next());
    }
}
