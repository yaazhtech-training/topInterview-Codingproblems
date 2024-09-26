package org.example.hashmap;

import java.util.HashMap;

public class NewClass {
    public static void main(String[] args){
     HashMap   <Integer,String>map = new HashMap<Integer,String>();
        map.put(100,"Mythili");
        map.put(101,"Thulasi");
        map.put(102,"Navani");
        map.put(103,"Sennammal");
        map.put(104,"Dhanasekaran");
        {
            System.out.println("The map is:" +map);
        }
        map.remove(100);
        {
            System.out.println("the map is :" +map);
        }
        map.remove(104);
        {
            System.out.println("the map is :" +map);
        }

    }
}
