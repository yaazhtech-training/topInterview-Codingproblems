package org.example.number;

public class FindLargestNumber {
    public static void main(String[] args){
        int[] anArray = {-9,3,0,7,-7,10,6,23,15};
        int largest = anArray[0];
        for(int i=0; i<anArray.length; i++){
            if(anArray[i] > largest){
                largest = anArray[i];
            }
        }
        System.out.println(largest);
    }
}




