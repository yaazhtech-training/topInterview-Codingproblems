package org.example.arrays1;

public class DuplicateSortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 8, 8, 9, 0, 6, 4, 4, 3, 3, 2, 23, 23, 78, 78, 99};
        int n = removeDuplicates(arr);
        System.out.println("The array are after removing elemements is");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;



    }
}