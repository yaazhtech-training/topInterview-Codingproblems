package org.example.exception;


import org.example.conditionalclass.WhileLoop;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModification {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("One");
        arr.add("Two");
        arr.add("Three");
        arr.add("Four");
        try{
            System.out.println(" Arraylist");
            Iterator<String>iter = arr.iterator();
            while(iter.hasNext()) {
                System.out.println(iter.next() + " ,");
            }

            System.out.println(" Iterator"+arr.add("Five"));
            System.out.println("Uptated arraylist");
            iter = arr.iterator();
            while(iter.hasNext()) {
                System.out.println(iter.next() + " ,");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
