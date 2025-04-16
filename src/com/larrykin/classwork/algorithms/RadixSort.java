package com.larrykin.classwork.algorithms;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Radix Sort is a non-comparative integer sorting algorithm that sorts data with
 * integer keys by grouping keys by individual digits which share the same significant
 * position and value.
 *
 * Time Complexity: O(d * (n + k)) where:
 * - d is the number of digits in the maximum number
 * - n is the number of elements in the array
 * - k is the range of each digit (usually 10 for decimal)
 *
 * Space Complexity: O(n + k)
 */
public class RadixSort {

    static Logger logger = Logger.getLogger(RadixSort.class.getName());

    public static void main(String[] args) {
        int[] arr = new int[]{170, 45, 75, 90, 802, 24, 2, 66, 3, 123};
        logger.log(Level.INFO, "Original array: {0}", Arrays.toString(arr));

        long ascStart = System.nanoTime();
        int[] ascResult = sort(arr, "ASC");
        long ascEnd = System.nanoTime();
        logger.log(Level.INFO, "ASC: {0}", Arrays.toString(ascResult));

        long descStart = System.nanoTime();
        int[] descResult = sort(arr, "DESC");
        long descEnd = System.nanoTime();
        logger.log(Level.INFO, "DESC: {0}", Arrays.toString(descResult));

        logger.log(Level.INFO, "With invalid order: {0}", Arrays.toString(sort(arr, "invalid")));

        // Log performance metrics
        logger.log(Level.INFO, "ASC sort time: {0} ns", (ascEnd - ascStart));
        logger.log(Level.INFO, "DESC sort time: {0} ns", (descEnd - descStart));
    }

    /**
     * Sorts an array of non-negative integers in the specified order using Radix Sort.
     *
     * @param arr   an array of non-negative integers
     * @param order sort direction: "ASC" for ascending, "DESC" for descending
     * @return a new sorted array (original array is unchanged)
     */
    public static int[] sort(int[] arr, String order) {
        // Create a copy to avoid modifying the original array
        int[] result = Arrays.copyOf(arr, arr.length);

        boolean isAscending;
        if (order.equalsIgnoreCase("ASC")) {
            isAscending = true;
        } else if (order.equalsIgnoreCase("DESC")) {
            isAscending = false;
        } else {
            logger.log(Level.WARNING, "Order {0} is not valid. Use 'ASC' or 'DESC'.", order);
            return result;
        }

        if (result.length <= 1) {
            return result; // Already sorted
        }

        radixSort(result);

        // If descending order is required, reverse the array
        if (!isAscending) {
            reverseArray(result);
        }

        return result;
    }

    /**
     * Performs Radix Sort on the given array.
     *
     * @param arr array to sort
     */
    private static void radixSort(int[] arr) {
        // Find the maximum number to know the number of digits
        int max = findMax(arr);

        // Do counting sort for every digit
        // Starting from least significant digit (LSD) to most significant digit (MSD)
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(arr, exp);
        }
    }

    /**
     * A modified counting sort that sorts array based on the digit at specified position.
     *
     * @param arr array to sort
     * @param exp current digit position (1, 10, 100, etc.)
     */
    private static void countingSortByDigit(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n]; // Output array
        int[] count = new int[10]; // Count array for digits 0-9

        // Initialize count array
        Arrays.fill(count, 0);

        // Store count of occurrences of current digit
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        // Change count[i] so that count[i] contains actual position
        // of this digit in output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array in a stable way
        // Process items in reverse to maintain stability
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy the output array to arr[]
        System.arraycopy(output, 0, arr, 0, n);
    }

    /**
     * Reverses the elements of an array.
     *
     * @param arr array to reverse
     */
    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move indices toward the center
            start++;
            end--;
        }
    }

    /**
     * Finds the maximum value in an array.
     *
     * @param arr input array
     * @return the maximum value
     */
    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}