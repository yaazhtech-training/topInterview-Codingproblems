package org.example.number;

public class FindLowestNumber {
    public static void main (String[] agrs){
        int anarray[] = {9,-3,0,2,1,5};
        int a[]=new int[5];
        int Lowest = Integer.MAX_VALUE;
        a[0]=anarray[0];
        for(int i=0; i<anarray.length; i++){
            if (anarray[i]< Lowest){
                Lowest=anarray[i];
            }
        }
        System.out.println("Lowest value is:" +Lowest);

    }

}




