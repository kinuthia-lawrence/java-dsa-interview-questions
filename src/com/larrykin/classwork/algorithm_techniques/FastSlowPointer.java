package com.larrykin.classwork.algorithm_techniques;

/**
 * Fast & Slow Pointer Technique
 * Used to detect cycles in linked lists or arrays.
 */
public class FastSlowPointer {
    public static boolean hasCycle(int[] arr) {
        int slow = 0, fast = 0;
        while (fast < arr.length && fast + 1 < arr.length) {
            slow++;
            fast += 2;
            if (slow == fast) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(hasCycle(arr));
    }
}

