package org.example.hashmap;

import java.util.HashSet;

public class SizeSet {
    public static void main(String[] args){
        HashSet<Integer> rollno = new HashSet<Integer>();
        rollno.add(0);
        rollno.add(2);
        rollno.add(3);
        rollno.add(4);
        rollno.add(5);
        {
            System.out.println(rollno.size());
        }

    }
}
