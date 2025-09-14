package com.larrykin.classwork.algorithm_techniques;

/**
 * Recursion Technique
 * Solves problems by breaking them into smaller subproblems.
 */
public class RecursionTechnique {
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}

