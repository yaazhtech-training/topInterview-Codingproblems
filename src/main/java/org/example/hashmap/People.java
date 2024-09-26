package org.example.hashmap;

import java.util.HashMap;

public class People {
    public static void main(String[] args){
        HashMap<Integer, String> people = new HashMap<Integer, String>();
        people.put(30,"John");
        people.put(40,"Moni");
        people.put(50,"David");
        people.put(60,"Jack");
        people.put(70,"Dany");
        for(Integer i : people.keySet())
        {
            System.out.println("Mark:" +i+"Name:"+people.get(i));

        }

    }

}
