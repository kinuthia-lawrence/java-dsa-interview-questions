package com.larrykin.classwork.algorithms;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * The Selection Sort algorithm finds the lowest value in an array and moves it to the front of the array.
 */
public class SelectionSort {

    static Logger logger = Logger.getLogger(SelectionSort.class.getName());

    /**
     * Entry point of the application
     *
     * @param args commandline arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[]{7, 12, 9, 11, 3};
        logger.info("ASC " + Arrays.toString(sort(arr, "ASC")));
        logger.info("DESC " + Arrays.toString(sort(arr, "DESC")));
    }

    /**
     * Optimized Solutions
     * Sorts an array of integers in ascending or descending order
     *
     * @param arr   an array of integers
     * @param order the order in which to sort the array [ASC for ascending, DESC for descending]
     * @return an array of integers sorted in ascending or descending order
     */
    private static int[] sort(int[] arr, String order) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < length; j++) {
                if (order.equalsIgnoreCase("ASC")) {
                    if (arr[j] < arr[min_index]) {
                        min_index = j;
                    }
                } else if (order.equalsIgnoreCase("DESC")) {
                    if (arr[j] > arr[min_index]) {
                        min_index = j;
                    }
                } else {
                    System.out.printf("Order %s does not exist", order);
                    return arr;
                }
            }
            // Swap elements properly after finding the min/max
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        return arr;
    }

}
