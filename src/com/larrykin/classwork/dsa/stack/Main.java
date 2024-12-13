package com.larrykin.classwork.dsa.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Larry");
        stack.push("Kin");
        stack.push("Liang");
        stack.push("Kinuthia");
        System.out.println(stack);
        String top = stack.peek();
        System.out.printf("The top is : %s%n", top); //?format string and print in new line.
        String popped = stack.pop();
        System.out.printf("Popped: %s%n", popped);
        System.out.println(stack);
        System.out.println(stack.search("Kin")); //?search for the index of the element in the stack -- returns -1 if not found


        /* ?Uses of stack
        * Used in undo and redo operations in text editors
        * Used in back and forward buttons in browsers
        * Used in the implementation of the call stack( calling functions) in programming languages
        * backtracking algorithms(maze solving, tree traversal,file directory traversal)
        * */

    }
}
