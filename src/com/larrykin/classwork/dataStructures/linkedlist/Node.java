package com.larrykin.classwork.dataStructures.linkedlist;

/** A generic node class to represent a linked list that contains nodes with data items of type String that contains the
name of a county and type double that contains a population index*/
public class Node <T, U>{
    T name;
    U populationIndex;
    Node<T, U> next; //? Reference to the next node

    public Node(T name, U populationIndex){
        this.name = name;
        this.populationIndex = populationIndex;
        this.next = null; //? Initially the next node is empty
    }
}
