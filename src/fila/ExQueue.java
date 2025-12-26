package fila;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ExQueue {
    public static void main (String[] args){

        //fila baseada em linked list.
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Cliente 1");
        queue.offer("Cliente 2");
        System.out.println(queue.poll());

        //fila de prioridade(ordenada) baseada em heap
        PriorityQueue<Integer> filaPrioridade = new PriorityQueue<Integer>();
        filaPrioridade.offer(30);
        filaPrioridade.offer(10);
        filaPrioridade.offer(20);
        System.out.println(filaPrioridade.poll());
    }
}
