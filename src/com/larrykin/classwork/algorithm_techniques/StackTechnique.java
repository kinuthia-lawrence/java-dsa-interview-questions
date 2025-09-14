package com.larrykin.classwork.algorithm_techniques;

/**
 * Stack Technique
 * Uses LIFO (Last-In-First-Out) principle for data storage and retrieval.
 */
import java.util.Stack;

public class StackTechnique {
    public static void demo() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop()); // Output: 2
    }
    public static void main(String[] args) {
        demo();
    }
}

