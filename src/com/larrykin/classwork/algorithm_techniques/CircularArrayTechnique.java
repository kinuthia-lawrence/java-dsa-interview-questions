package com.larrykin.classwork.algorithm_techniques;

/**
 * Circular Array Technique
 * Useful for problems involving wrap-around indexing.
 */
public class CircularArrayTechnique {
    public static int nextIndex(int[] arr, int current) {
        return (current + 1) % arr.length;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(nextIndex(arr, 4)); // Output: 0
    }
}

