package com.larrykin.classwork.algorithms;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Counting Sort is a non-comparison-based sorting algorithm that works well for
 * integers with a limited range. It counts occurrences of each element and uses
 * that information to place elements at their correct positions.
 *
 * Time Complexity: O(n + k) where n is the number of elements and k is the range of input
 * Space Complexity: O(n + k)
 */
public class CountingSort {

    static Logger logger = Logger.getLogger(CountingSort.class.getName());

    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 2, 8, 3, 3, 1, 0, 9, 7, 6, 5};
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
     * Sorts an array of non-negative integers in the specified order.
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

        countingSort(result, isAscending);
        return result;
    }

    /**
     * Performs counting sort on the given array in specified direction.
     *
     * @param arr         array to sort
     * @param isAscending true for ascending, false for descending
     */
    private static void countingSort(int[] arr, boolean isAscending) {
        // Find the maximum value in the array
        int max = findMax(arr);

        // Create a count array to store the count of each unique number
        int[] count = new int[max + 1];

        // Initialize count array
        for (int i = 0; i <= max; i++) {
            count[i] = 0;
        }

        // Store the count of each element
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // If descending order is required, process the count array differently
        if (isAscending) {
            // Store the sorted elements back into the original array (ascending)
            int index = 0;
            for (int i = 0; i <= max; i++) {
                while (count[i] > 0) {
                    arr[index++] = i;
                    count[i]--;
                }
            }
        } else {
            // Store the sorted elements back into the original array (descending)
            int index = 0;
            for (int i = max; i >= 0; i--) {
                while (count[i] > 0) {
                    arr[index++] = i;
                    count[i]--;
                }
            }
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