package org.example.hashmap;

import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<String>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("Gova");
        fruits.add("Grapes");
        {
            System.out.println(fruits);
        }
    }
}