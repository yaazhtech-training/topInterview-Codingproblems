package org.example.arrays;

import java.util.HashMap;
import java.util.Map;


public class Frequency {
    static void frequencyNumber(int arr[],int size)
    {
        HashMap<Integer,Integer>freqMap = new HashMap<Integer, Integer>();
        for(int i=0;i<size;i++){
            if(freqMap.containsKey(arr[i])){
                freqMap.put(arr[i],freqMap.get(arr[i])+1);
            }
            else{
                freqMap.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:freqMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());

        }


    }
    public static void main(String[] args) {
        int arr[] = {10,20,80,80,20,50,60,50,10};
        int size=arr.length;
        frequencyNumber(arr,size);

    }
}
