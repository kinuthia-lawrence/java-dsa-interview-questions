package com.larrykin.classwork.dataStructures.linkedlist;

public class LinkedList<T, U> {
    //? reference to the head of the linked list
    Node<T, U> head;

    //? Method to display data items in the list
    public void displayList() {
        Node<T, U> current = head; //?Start from the head node

        while (current != null) {
            System.out.println("County: " + current.name + ", Population Index:" + current.populationIndex);
            current = current.next; //? move to the next node
        }
    }

    //? Method to add data items in the list
    public void addNode(T name, U populationIndex) {
        Node<T, U> newNode = new Node<>(name, populationIndex);
        if (head == null) {
            head = newNode; //? If the linked list is empty, create the head.
        } else {
            Node<T, U> current = head; //? start traversing at the head.
            while (current.next != null){ //? Check if there is a pointer for next element in the linked list
                current = current.next; //? traverse to the last node.
            }
            current.next = newNode; //? Add the new Node at the last.
        }
    }
}
