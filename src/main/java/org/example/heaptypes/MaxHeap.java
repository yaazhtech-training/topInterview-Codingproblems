package org.example.heaptypes;

import java.util.PriorityQueue;

public class MaxHeap {
    public static void main(String[] args) {
        PriorityQueue intQueue = new PriorityQueue();
        Integer[] array1 = {1,8,7,14,7,5};
        Integer[] array2 = {2,4,6,8,10};
        Integer[] array3 = {3,5,7,9,12};
        Integer[] array4 = {1,2,3,4,5,6,7};
        Integer[] array5 = {1,2,};
        intQueue.add(array1.length);
        intQueue.add(array2.length);
        intQueue.add(array3.length);
        intQueue.add(array4.length);
        intQueue.add(array5.length);
        while(intQueue.size()!=0){
            System.out.println(intQueue.remove());
        }


    }
}
