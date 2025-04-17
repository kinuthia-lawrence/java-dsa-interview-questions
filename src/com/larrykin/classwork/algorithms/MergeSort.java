package com.larrykin.classwork.algorithms;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Merge Sort is a divide-and-conquer algorithm that divides the input array into two halves,
 * recursively sorts them, and then merges the sorted halves.
 *
 * Time Complexity: O(n log n) in all cases
 * Space Complexity: O(n)
 */
public class MergeSort {

    static Logger logger = Logger.getLogger(MergeSort.class.getName());

    public static void main(String[] args) {
        int[] arr = new int[]{38, 27, 43, 3, 9, 82, 10};
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
     * Sorts an array of integers in the specified order using Merge Sort.
     *
     * @param arr   array to sort
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

        mergeSort(result, 0, result.length - 1, isAscending);
        return result;
    }

    /**
     * Recursively divides the array into halves and merges them in sorted order.
     *
     * @param arr         array to sort
     * @param left        left index of the subarray
     * @param right       right index of the subarray
     * @param isAscending sort direction
     */
    private static void mergeSort(int[] arr, int left, int right, boolean isAscending) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Sort first and second halves
            mergeSort(arr, left, mid, isAscending);
            mergeSort(arr, mid + 1, right, isAscending);

            // Merge the sorted halves
            merge(arr, left, mid, right, isAscending);
        }
    }

    /**
     * Merges two subarrays of arr[].
     * First subarray is arr[left..mid]
     * Second subarray is arr[mid+1..right]
     *
     * @param arr         array containing subarrays to merge
     * @param left        left index of first subarray
     * @param mid         end index of first subarray
     * @param right       end index of second subarray
     * @param isAscending sort direction
     */
    private static void merge(int[] arr, int left, int mid, int right, boolean isAscending) {
        // Calculate sizes of the two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        // Merge the temporary arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray
        int k = left;

        while (i < n1 && j < n2) {
            boolean shouldTakeFromLeft;

            if (isAscending) {
                shouldTakeFromLeft = L[i] <= R[j];
            } else {
                shouldTakeFromLeft = L[i] >= R[j];
            }

            if (shouldTakeFromLeft) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}