package com.larrykin.classwork.algorithm_techniques;

/**
 * Divide and Conquer Technique
 * Breaks problems into smaller subproblems, solves them recursively, and combines results.
 */
public class DivideAndConquerTechnique {
    public static int max(int[] arr, int left, int right) {
        if (left == right) return arr[left];
        int mid = left + (right - left) / 2;
        int leftMax = max(arr, left, mid);
        int rightMax = max(arr, mid + 1, right);
        return Math.max(leftMax, rightMax);
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 9, 2};
        System.out.println(max(arr, 0, arr.length - 1));
    }
}

