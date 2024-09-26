package org.example.hashmap;

import java.util.HashMap;

public class PrintValues {
    public static void main(String[] args){
        HashMap<String,String>capitalcities = new HashMap<String,String>();
        capitalcities.put("England","Landon");
        capitalcities.put("Germany","Berlin");
        capitalcities.put("Norway","Oslo");
        capitalcities.put("USA","Wasingdon DC");
        for(String i : capitalcities.values())
        {
            System.out.println(i);
        }
    }
}
