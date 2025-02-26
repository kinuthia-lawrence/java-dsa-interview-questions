package com.larrykin.classwork.dataStructures.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList<String, Double> linkedList = new LinkedList<>(); //? creating an instance of the linked list.

        //? Adding nodes to the list.
        linkedList.addNode("Tharaka - nithia", 600.5);
        linkedList.addNode("Meru", 610.5);
        linkedList.addNode("Nyanyuki", 620.5);
        linkedList.addNode("Nyeri", 630.5);
        linkedList.addNode("Kirinyaga", 640.5);

        //? Display nodes
        System.out.println("-----------------Linked List Content -------");
        linkedList.displayList();
    }
}
