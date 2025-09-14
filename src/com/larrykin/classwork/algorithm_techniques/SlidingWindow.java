package com.larrykin.classwork.algorithm_techniques;

/**
 * Sliding Window Technique
 * Used to solve problems involving subarrays or substrings with optimal time complexity.
 */
public class SlidingWindow {
    public static int maxSum(int[] arr, int k) {
        int max = 0, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i >= k) sum -= arr[i - k];
            if (i >= k - 1) max = Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(maxSum(arr, 3));
    }
}

