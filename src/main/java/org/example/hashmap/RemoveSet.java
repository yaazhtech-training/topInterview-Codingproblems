package org.example.hashmap;

import java.util.HashSet;

public class RemoveSet {
    public RemoveSet() {
        super();
    }

    public static void main(String[] args) {
        HashSet<String>fruit = new HashSet<String>();
        fruit.add("apple");
        fruit.add("Banana");
        fruit.add("orange");
        fruit.add("Grape");
        fruit.remove("apple");
        {
            System.out.println(fruit);

        }

    }

}
