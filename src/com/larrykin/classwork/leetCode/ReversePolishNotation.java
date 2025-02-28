package com.larrykin.classwork.leetCode;

import java.util.Stack;

/**
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * Valid operators are +,-, *, /. Each operand may be an integer or another
 * expression.
 * Some examples:
 * ["2", "1", "+", "3", "*"]-> ((2 + 1) * 3)-> 9
 * ["4", "13", "5", "/", "+"]-> (4 + (13 / 5))-> 6
 */
public class ReversePolishNotation {
    public static void main(String[] args) {
        String[] tokens = new String[]{"2", "1", "+", "3", "*"};
//        String[] tokens = new String[]{"4", "13", "5", "/", "+"};
        System.out.println(solution1(tokens)); // Using Stack / using stack
        System.out.println(solution2(tokens)); // best way
    }

    //Using switch String statement
    private static int solution1(String[] tokens) {
        int returnValue = 0;
        String operators = "*/-+";

        Stack<String> stack = new Stack<String>();
        for (String t : tokens) {
            if (!operators.contains(t)) {
                stack.push(t);
            } else {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                switch (t) {
                    case "+":
                        stack.push(String.valueOf(a + b));
                        break;
                    case "-":
                        stack.push(String.valueOf(a - b));
                        break;
                    case "*":
                        stack.push(String.valueOf(a * b));
                        break;
                    case "/":
                        stack.push(String.valueOf(a / b));
                        break;
                }
            }
        }

        returnValue = Integer.valueOf(stack.pop());
        return returnValue;
    }

    //Using index instead
    private static int solution2(String[] tokens) {
        int returnVal = 0;
        String operators = "+-*/";

        Stack<String> stack = new Stack<String>();
        for (String t : tokens) {
            if (!operators.contains(t)) {
                stack.push(t);
            } else {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                int index = operators.indexOf(t);
                switch (index) {
                    case 0:
                        stack.push(String.valueOf(a + b));
                        break;
                    case 1:
                        stack.push(String.valueOf(a - b));
                        break;
                    case 2:
                        stack.push(String.valueOf(a * b));
                        break;
                    case 3:
                        stack.push(String.valueOf(a / b));
                        break;
                }
            }
        }

        returnVal = Integer.valueOf(stack.pop());
        return returnVal;
    }

}
