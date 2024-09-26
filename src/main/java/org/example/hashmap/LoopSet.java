package org.example.hashmap;

import java.util.HashSet;

public class LoopSet {
    public static void main(String[] args){
        HashSet<String>names = new HashSet<String>();
        names.add("pooja");
        names.add("shana");
        names.add("sheeja");
        names.add("mythili");
        for(String i : names)
        {
            System.out.println(i);
        }
    }
}
