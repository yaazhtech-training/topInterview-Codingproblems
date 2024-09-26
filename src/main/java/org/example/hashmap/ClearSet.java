package org.example.hashmap;

import java.util.HashSet;

public class ClearSet {
    public static void main(String[] args){
        HashSet<String>animals = new HashSet<String>();
        animals.add("dog");
        animals.add("cat");
        animals.add("lion");
        animals.add("pig");
        animals.add("tiger");
        animals.clear();
        {
            System.out.println(animals);
        }
    }
}
