package org.example.hashmap;

import java.util.HashSet;

public class ExampleSet {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(1);
        numbers.add(7);
        numbers.add(6);
        numbers.add(5);
        numbers.add(4);
        for (int i = 0; i <= 10; i++)
            if (numbers.contains(i))
        {
        System.out.println(i+"was found in tne set");

        }
        else
            {
                System.out.println(i+"was not found in tne set");
            }
    }
}
