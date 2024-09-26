package org.example.hashmap;

import java.util.HashMap;

public class PrintKey {
    public static void main(String[] args){
        HashMap<String,String>capitalcities = new HashMap<String,String>();
        capitalcities.put("England","London");
        capitalcities.put("Germany","Berlin");
        capitalcities.put("Norway","New York");
        capitalcities.put("USA","Wakingdon DC");
        for(String i: capitalcities.keySet()){
            System.out.println(i);
        }
    }
}
