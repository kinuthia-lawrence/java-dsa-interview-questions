package com.larrykin.classwork.dsa.priorityQueues;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQ {
    public static void main(String[] args) {
        //? priorityQueue is a FIFO data structure that serves element with higher priority first.
        //?Elements are arranged in lexicographical (order based on their alphabetical or numerical order).
        // we have to use a class that utilizes the queue interface.

//        Queue<Double> priorityQueue = new PriorityQueue<>();
        //? To arrange them in descending order, we can use a compiler in a constructor.
        Queue<Double> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        priorityQueue.add(1.0);
        priorityQueue.offer(3.5);
        priorityQueue.add(2.0);
        priorityQueue.offer(4.5);
        priorityQueue.offer(2.5);

        //? example when polling the queue
        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }


    }
}
