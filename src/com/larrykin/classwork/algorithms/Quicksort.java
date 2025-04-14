package com.larrykin.classwork.algorithms;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The Quicksort algorithm takes an array of values, chooses one of the values as the 'pivot' element, and moves the other values so that lower values are on the left of the pivot element, and higher values are on the right of it.
 */
public class Quicksort {

    static Logger logger = Logger.getLogger(Quicksort.class.getName());

    public static void main(String[] args) {
        int[] arr = new int[]{};
        logger.log(Level.INFO, "ASC {0}", Arrays.toString(sort(arr, "ASC")));
        logger.log(Level.INFO, "DESC {0}", Arrays.toString(sort(arr, "DESC")));
    }

   private static int[] sort(int[] arr, String order) {
       // Create a copy to avoid modifying the original array
       int[] result = Arrays.copyOf(arr, arr.length);

       boolean isAscending;
       if (order.equalsIgnoreCase("ASC")) {
           isAscending = true;
       } else if (order.equalsIgnoreCase("DESC")) {
           isAscending = false;
       } else {
           logger.log(Level.WARNING, "Order {0} does not exist. Try `asc` or `desc`", order);
           return result;
       }
       quicksort(result, isAscending);

       return result;
   }

   /**
    * Helper method to perform quicksort in the specified direction
    *
    * @param arr         array to sort
    * @param isAscending true for ascending order, false for descending
    */
   private static void quicksort(int[] arr, boolean isAscending) {
       if (arr == null || arr.length <= 1) {
           return; // Already sorted
       }
       quicksortRecursive(arr, 0, arr.length - 1, isAscending);
   }

   /**
    * Recursive quicksort implementation
    *
    * @param arr         array to sort
    * @param low         starting index
    * @param high        ending index
    * @param isAscending sort direction
    */
   private static void quicksortRecursive(int[] arr, int low, int high, boolean isAscending) {
       if (low < high) {
           // Partition the array and get the pivot position
           int pivotIndex = partition(arr, low, high, isAscending);

           // Recursively sort the subarrays
           quicksortRecursive(arr, low, pivotIndex - 1, isAscending);
           quicksortRecursive(arr, pivotIndex + 1, high, isAscending);
       }
   }

   /**
    * Partitions the array around a pivot element
    *
    * @param arr         array to partition
    * @param low         starting index
    * @param high        ending index
    * @param isAscending sort direction
    * @return the final position of the pivot element
    */
   private static int partition(int[] arr, int low, int high, boolean isAscending) {
       // Choose the rightmost element as pivot
       int pivot = arr[high];
       int i = low - 1; // Index of smaller/larger element

       for (int j = low; j < high; j++) {
           boolean shouldSwap;

           if (isAscending) {
               shouldSwap = arr[j] <= pivot;
           } else {
               shouldSwap = arr[j] >= pivot;
           }

           if (shouldSwap) {
               i++;
               // Swap arr[i] and arr[j]
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
       }

       // Swap arr[i+1] and arr[high] (put the pivot in its final sorted position)
       int temp = arr[i + 1];
       arr[i + 1] = arr[high];
       arr[high] = temp;

       return i + 1;
   }
}
