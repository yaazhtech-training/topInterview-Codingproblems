package org.example.arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int arr[ ] = {7,1,0,6,4,9};
        int sum = 0;
        int i;
        for(    i=0; i<arr.length;i++){
            sum += arr[i];

        }
        System.out.println("The sum is :" +sum);
    }
}
