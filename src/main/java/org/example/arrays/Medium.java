package org.example.arrays;
import java.util.Arrays;

public class Medium {
    static private void getmedium(int[] arr,int n){
        Arrays.sort(arr);
        if(n%2==0){
            int ind1 = (n/20)-1;
            int ind2 = (n/2);
            System.out.println((double)(arr[ind1]+arr[ind2]));
        }
        else{
            System.out.println(arr[(n/2)]);
        }
    }
    public static void main(String[] args){
        int arr [] = {5,0,9,8,7,4,3,2,1};
        int n = arr.length;
        System.out.print("The medium of the array is :");
        getmedium(arr,n);

    }
}
