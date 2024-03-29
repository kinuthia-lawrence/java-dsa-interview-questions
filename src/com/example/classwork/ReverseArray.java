package com.example.classwork;

public class ReverseArray {
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Print the array to the console
        System.out.println(arr1.toString());
    }

    public static void reversedArray(int[] arr) {
        // Initialize start and end pointers
        int start = 0;
        int end = arr.length - 1;

        // Loop until start is less than end
        while(start < end) {
            // Swap the elements at start and end positions
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // Increment start and decrement end
            start++;
            end--;
        }
    }
}