package fila;

import java.util.PriorityQueue;
import java.util.Collections;

public class minHeap {
    public static void main(String[] args){

        PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
        minheap.add(30);
        minheap.add(10);
        minheap.add(20);
        System.out.println(minheap.poll());

        PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>(Collections.reverseOrder());
        maxheap.add(30);
        maxheap.add(10);
        maxheap.add(20);
        System.out.println(maxheap.poll());
    }

}
