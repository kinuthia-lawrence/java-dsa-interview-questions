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
//        int[] array = new int[]{3, 7, 9, 11, 12};

        Long whileAscStart = System.nanoTime();
        System.out.println("ASC :: " + Arrays.toString(sort(array, "ASC")));
        Long whileAscEnd = System.nanoTime();

        Long whileDESCStart = System.nanoTime();
        System.out.println("DESC :: " + Arrays.toString(sort(array, "DESC")));
        Long whileDESCEnd = System.nanoTime();

        Long nestedASCStart = System.nanoTime();
        System.out.println("ASC Nested :: " + Arrays.toString(sortWithNestedForLoop(array, "ASC")));
        Long nestedASCEnd = System.nanoTime();

        Long nestedDescStart = System.nanoTime();
        System.out.println("DESC Nested :: " + Arrays.toString(sortWithNestedForLoop(array, "DESC")));
        Long nestedDescEnd = System.nanoTime();

        System.out.println("While ASC: " + (whileAscEnd - whileAscStart) + " ns");
        System.out.println("Nested ASC: " + (nestedASCEnd - nestedASCStart) + " ns");
        System.out.println("While DESC: " + (whileDESCEnd - whileDESCStart) + " ns");
        System.out.println("Nested DESC:" + (nestedDescEnd - nestedDescStart) + " ns");

    }

    /**
     * Slow solution
     * Sorts an array of integers in ascending or descending order
     *
     * @param arr   an array of integers
     * @param order the order in which to sort the array [ASC for ascending, DESC for descending]
     * @return an array of integers sorted in ascending or descending order
     */
    public static int[] sort(int[] arr, String order) {
        int count = arr.length;
        while (count > 0) {
            boolean swapped = false;
            if (order.equalsIgnoreCase("ASC")) {
                int length = arr.length;
                for (int i = 0; i < length - 1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        swapped = true;
                    }
                    if (!swapped) break;
                    length--;
                }
            } else if (order.equalsIgnoreCase("DESC")) {
                int length = arr.length;
                for (int i = 0; i < length + 2; i++) {
                    if (arr[i] < arr[i + 1]) {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        swapped = true;
                    }
                    if (!swapped) break;
                    length--;
                }
            } else {
                System.out.println("Invalid Order, use `ASC` or `DESC`");
                break;
            }
            count--;
        }

        return arr;
    }


    /**
     * Optimized Solutions
     * Sorts an array of integers in ascending or descending order
     *
     * @param arr   an array of integers
     * @param order the order in which to sort the array [ASC for ascending, DESC for descending]
     * @return an array of integers sorted in ascending or descending order
     */
    public static int[] sortWithNestedForLoop(int[] arr, String order) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                boolean swapped = false;
                if (order.equalsIgnoreCase("ASC")) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                    if (!swapped) break;
                } else if (order.equalsIgnoreCase("DESC")) {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                    if (!swapped) break;
                } else {
                    System.out.println("Invalid Order, use `ASC` or `DESC`");
                    break;
                }
            }
        }

        return arr;
    }
}
