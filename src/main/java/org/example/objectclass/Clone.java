package org.example.objectclass;

import java.util.ArrayList;

public class Clone {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");
        cars.add("Honda");
        cars.add("Ford");
        ArrayList cars2 = (ArrayList) cars.clone();
        cars2.set(0,"Toyota");
        System.out.println(cars);
        System.out.println(cars2);
    }

        }



