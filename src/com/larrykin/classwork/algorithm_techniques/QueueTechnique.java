package com.larrykin.classwork.algorithm_techniques;

/**
 * Queue Technique
 * Uses FIFO (First-In-First-Out) principle for data storage and retrieval.
 */
import java.util.LinkedList;
import java.util.Queue;

public class QueueTechnique {
    public static void demo() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        System.out.println(queue.poll()); // Output: 1
    }
    public static void main(String[] args) {
        demo();
    }
}

