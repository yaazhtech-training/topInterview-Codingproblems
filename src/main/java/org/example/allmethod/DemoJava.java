package org.example.allmethod;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class DemoJava {
    public static void main(String[] args){
        HashMap hm =new HashMap();
        hm.put("Rathika",11);
        hm.put("Jothi",12);
        hm.put("James",13);
        hm.put("Jack",14);
        System.out.println(hm);
        HashMap hm2 = new HashMap();
        hm2.putAll(hm);
        System.out.println(hm2);
        System.out.println(hm2.get("Rathika"));
        System.out.println(hm2.containsKey("James"));
        System.out.println(hm2.containsValue(14));
        System.out.println(hm2.remove("Jack"));
        System.out.println(hm2);
        System.out.println(hm2.remove("Jothi",12));
        System.out.println(hm2);
        System.out.println(hm2.size());
        Set s= hm.entrySet();
        System.out.println(s);
        Collection c = hm.values();
        System.out.println(c);
        System.out.println(hm2.keySet());
        System.out.println(hm2.isEmpty());
        hm2.clear();
        System.out.println(hm2.isEmpty());

    }
}
