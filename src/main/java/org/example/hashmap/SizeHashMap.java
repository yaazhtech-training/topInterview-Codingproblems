package org.example.hashmap;

import java.util.HashMap;

public class SizeHashMap {
    public static void main(String[] args){
        HashMap<String,String> capitalcities =new HashMap<String,String>();
        capitalcities.put("Engaland","Landon");
        capitalcities.put("Germany","Berlin");
        capitalcities.put("Norway","Osla");
        capitalcities.put("USA","Wasingdon DC");
        {
            System.out.println(capitalcities.size());
        }
    }
}
