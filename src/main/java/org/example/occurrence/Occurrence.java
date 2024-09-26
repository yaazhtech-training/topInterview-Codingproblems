package org.example.occurrence;

public class Occurrence {
    public static void main(String[] args){
        int arr[] ={10,20,30,40,70,70,40,30,60,10};
        int n = arr.length;
        countFreq (arr,n);


    }
    public static void countFreq(int arr[],int n){
        boolean visited []=new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i] == true)
                continue;
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println (arr[i] + " "+count);       }

    }

}
