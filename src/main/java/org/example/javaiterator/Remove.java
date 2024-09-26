package org.example.javaiterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Remove {
    public static void main(String[] args) {
        ArrayList<Integer>num = new ArrayList<Integer>();
        num.add(1);
        num.add(23);
        num.add(45);
        num.add(5);
        num.add(6);
        Iterator<Integer>it = num.iterator();
        while(it.hasNext()) {
            Integer i = it. next();
            if(i<10){
                it.remove();

            }
        }
        System.out.println(num);
    }
}
