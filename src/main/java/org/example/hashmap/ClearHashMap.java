package org.example.hashmap;

import java.util.HashMap;

public class ClearHashMap {
    public static void main(String[]args){
        HashMap<String,String>capitalcities=new HashMap<String,String>();
        capitalcities.put("England","landon");
        capitalcities.put("Germaney","berlin");
        capitalcities.put("Norway","Oslo");
        capitalcities.put("USA","washington DC");
        capitalcities.clear();
        {
            System.out.println(capitalcities);
        }

    }
}
