package org.example.heaptypes;

import java.util.PriorityQueue;

public class MinHeap {
    static PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    public static void view(){
        for  (Integer i : minHeap){
            System.out.print(i+"");
        }

        System.out.println();

    }
    public static void main(String[] args){
        minHeap.add(5);
        System.out.println("minHeap.add(5)=");
        view();
        minHeap.add(7);
        minHeap.add(9);
        minHeap.add(4);
        minHeap.add(1);
        minHeap.add(6);
        minHeap.add(8);
        System.out.println("minHeap.view()");
        view();
        System.out.println("minHeap.peak()="+minHeap.peek());
        minHeap.poll();
        System.out.println("minHeap.poll()=");
        view();
        minHeap.remove(1);

        System.out.println("minHeap.remove(1)=");
        view();
        boolean elementsFound=minHeap.contains(8);
        System.out.println("minHeap.contains(8)="+elementsFound);
        elementsFound=minHeap.contains(0);
        System.out.println("minHeap.contains(0)="+elementsFound);




    }
}


