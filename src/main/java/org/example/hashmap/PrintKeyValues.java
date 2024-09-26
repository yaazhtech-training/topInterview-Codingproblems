package org.example.hashmap;

import java.util.HashMap;

public class PrintKeyValues {
    public static void main(String[] args){
        HashMap<String, String> capitalcities = new HashMap<String, String>();
        capitalcities.put("England","Landon");
        capitalcities.put("Germany","France");
        capitalcities.put("Narway","Oslo");
        capitalcities.put("USA","Washingdon Dc");
        for(String i : capitalcities.keySet())
            System.out.println("key: " + i + " value: " + capitalcities.get(i));
    }
}
