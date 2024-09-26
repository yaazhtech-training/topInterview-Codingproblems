package org.example.arrays1;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = new int[]{5,4,3,2,1};
        System.out.println("Original Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Reversed Array: ");
        for(int  i=arr.length-1;i>=0; i--)


        {
            System.out.print(arr[i]+"");
        }


    }
}
