package com.larrykin.classwork.dsa.linkedlist;

import java.util.LinkedList;

public class LinkedExample {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();

        cars.add("Toyota");
        cars.add("Nissan");
        cars.add("Subaru");
        cars.offer("Mazda");
        cars.offer("Honda");
        cars.offer("Mitsubishi");
        cars.addFirst("Mercedes"); //? Add to the first position
        System.out.println("Cars--------\n"+ cars);
        System.out.println("First car: " + cars.getFirst());
        System.out.println("Last car: " + cars.getLast());
        System.out.println("Size: " + cars.size());
        System.out.println("Is empty: " + cars.isEmpty());
        System.out.println("Index of Honda: " + cars.indexOf("Honda"));
        System.out.println("Peek first: " + cars.peekFirst());
        System.out.println("Peek last: " + cars.peekLast());
        System.out.println(cars);
        System.out.println("Poll first: " + cars.pollFirst());
        System.out.println(cars);
    }
}
