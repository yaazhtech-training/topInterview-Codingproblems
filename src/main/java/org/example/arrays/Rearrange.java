package org.example.arrays;
import java.util.Arrays;

public class Rearrange {
    public static void main (String [] args) {
        int arr[]= {4,0,8,6,9,3,1,5,1,4};
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n/2;i++){
            System.out.print(arr[i]+"");
        }
        for(int i=n-1;i>=n/2;i--){
            System.out.print(arr[i]+"");
        }

    }
}
