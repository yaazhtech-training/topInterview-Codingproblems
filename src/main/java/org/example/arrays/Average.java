package org.example.arrays;

public class Average {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int sum = 1;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];

        }
        {
                System.out.println("average  :" + sum /arr .length);
            }
        }
    }

