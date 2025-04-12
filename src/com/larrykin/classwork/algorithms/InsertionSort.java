package com.larrykin.classwork.algorithms;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The Insertion Sort algorithm uses one part of the array to hold the sorted values, and the other part of the array to hold values that are not sorted yet.
 */
public class InsertionSort {

    static Logger logger = Logger.getLogger(InsertionSort.class.getName());

    public static void main(String[] args) {
        int[] arr = new int[]{64, 34, 25, 12, 22, 11, 90, 5};
        logger.log(Level.INFO, "Length {0}", arr.length);

        long ascStart = System.nanoTime();
        int[] ascResult = sort(arr, "ASC");
        long ascEnd = System.nanoTime();
        logger.log(Level.INFO, "ASC {0}", Arrays.toString(ascResult));

        long descStart = System.nanoTime();
        int[] descResult = sort(arr, "DESC");
        long descEnd = System.nanoTime();
        logger.log(Level.INFO, "DESC {0}", Arrays.toString(descResult));

        logger.log(Level.INFO, "With custom order: {0}", Arrays.toString(sort(arr, "order")));

        // Log performance metrics
        logger.log(Level.INFO, "ASC sort time: {0} ns", (ascEnd - ascStart));
        logger.log(Level.INFO, "DESC sort time: {0} ns", (descEnd - descStart));
    }

    /**
     * Sorts an array of integers in ascending or descending order using the Insertion Sort algorithm.
     *
     * @param arr   an array of integers to be sorted
     * @param order the order in which to sort the array ("ASC" for ascending, "DESC" for descending)
     * @return a new array of integers sorted in the specified order
     */
    public static int[] sort(int[] arr, String order) {
        // Create a copy to avoid modifying the original array
        int[] result = Arrays.copyOf(arr, arr.length);

        // Determine sort direction based on order parameter
        boolean isAscending;
        if (order.equalsIgnoreCase("ASC")) {
            isAscending = true;
        } else if (order.equalsIgnoreCase("DESC")) {
            isAscending = false;
        } else {
            logger.log(Level.WARNING, "Order {0} is not valid. Use 'ASC' or 'DESC'.", order);
            return result;
        }

        // Apply insertion sort with the determined direction
        insertionSort(result, isAscending);

        return result;
    }

    /**
     * Helper method to perform insertion sort in the specified direction
     *
     * @param arr       array to sort
     * @param ascending true for ascending order, false for descending
     */
    private static void insertionSort(int[] arr, boolean ascending) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            if (ascending) {
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
            } else {
                while (j >= 0 && arr[j] < key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
            }

            arr[j + 1] = key;
        }
    }
}