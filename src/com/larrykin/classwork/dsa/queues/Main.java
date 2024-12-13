package com.larrykin.classwork.dsa.queues;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Larry");
        queue.offer("Kin");
        System.out.println(queue);
        System.out.println("Polled: " + queue.poll());
        System.out.println(queue);
        queue.offer("Kinutia");
        queue.offer("Cynthia");
        System.out.println("Peek: " + queue.peek());
        System.out.println("Element: " + queue.element()); //? retrieves the head of the queue but does not remove.
        System.out.println("Is empty: " + queue.isEmpty());
        System.out.println("Size: " + queue.size());
        System.out.println("Contains Kin: " + queue.contains("Kin"));

        /* Uses
        * queues are used in breadth-first search, linked list, priority queues, etc
        * Used in keyboard buffer( letters appear on the screen  in the order they are typed)
        *  printer queue, etc
        * */
    }
}
