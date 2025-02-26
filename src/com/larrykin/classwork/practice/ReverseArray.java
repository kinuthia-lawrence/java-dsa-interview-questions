package com.larrykin.classwork.practice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] arr1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        reverseArray(arr1);
    }

    public static void reverseArray(int[] arr) {
        // Initialize start and end pointers
        int start = 0;
        int end = arr.length - 1;

        // Loop through the array while start is less than end
        while (start < end) {
            // Swap the elements at start and end positions
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // Increment start and decrement end
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}