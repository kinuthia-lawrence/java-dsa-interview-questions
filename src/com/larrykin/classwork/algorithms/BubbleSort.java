package com.larrykin.classwork.algorithms;

import java.util.Arrays;

/**
 * <p>
 * Implements the Bubble Sort algorithm to sort an array of integers.
 * <br>
 * This class provides methods to sort the array in both ascending and descending order.
 * <br>
 * Name: Lawrence K<br>
 * Date: 2025-04-04<br>
 * </p>
 *
 * @author Lawrence K
 * @version 1.0
 * @since 2024
 */
public class BubbleSort {

    /**
     * Entry point of the application
     *
     * @param args commandline arguments
     */
    public static void main(String[] args) {

        int[] array = new int[]{7, 12, 9, 11, 3};


        System.out.println("ASC :: " + Arrays.toString(sort(array, "ASC")));
        System.out.println("DESC :: " + Arrays.toString(sort(array, "DESC")));

        System.out.println("ASC Nested :: " + Arrays.toString(sortWithNestedForLoop(array, "ASC")));
        System.out.println("DESC Nested :: " + Arrays.toString(sortWithNestedForLoop(array, "DESC")));

    }

    /**
     * Sorts an array of integers in ascending or descending order
     *
     * @param arr   an array of integers
     * @param order the order in which to sort the array [ASC for ascending, DESC for descending]
     * @return an array of integers sorted in ascending or descending order
     */
    public static int[] sort(int[] arr, String order) {
        int count = arr.length - 1;
        while (count > 0) {
            if (order.equalsIgnoreCase("ASC")) {
                int length = arr.length - 1;
                for (int i = 0; i < length; i++) {
                    if (arr[i] > arr[i + 1]) {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                    length--;
                }
            }
            if (order.equalsIgnoreCase("DESC")) {
                int length = arr.length - 1;
                for (int i = 0; i < length - 1; i++) {
                    if (arr[i] < arr[i + 1]) {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                    length--;
                }
            }
            count--;
        }

        return arr;
    }


    public static int[] sortWithNestedForLoop(int[] arr, String order) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (order.equalsIgnoreCase("ASC")) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                } else if (order.equalsIgnoreCase("DESC")) {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                } else {
                    System.out.println("Invalid Order, use `ASC` or `DESC`");
                }
            }
        }

        return arr;
    }
}
