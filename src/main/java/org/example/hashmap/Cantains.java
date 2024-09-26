package org.example.hashmap;


import java.util.HashMap;

public class Cantains {
    public static void main(String[] args) {
        HashMap<String,Integer> cars = new HashMap<String, Integer>();
        cars.put("Volvo",9);
        cars.put("BMW",7);
        cars.put("Audi",3);
        cars.put("Ford",1);
        cars.put("Mazda",0);
        {
            System.out.println(cars.containsKey("Audi"));
        }

    }
}
