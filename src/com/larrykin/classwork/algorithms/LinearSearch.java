package com.larrykin.classwork.algorithms;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Linear Search is a simple search algorithm that finds the position of a target value
 * within an array by checking each element sequentially until a match is found or
 * the end of the array is reached.
 *
 * Time Complexity: O(n) where n is the number of elements in the array
 * Space Complexity: O(1)
 */
public class LinearSearch {

    static Logger logger = Logger.getLogger(LinearSearch.class.getName());

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        logger.log(Level.INFO, "Array: {0}", Arrays.toString(arr));

        int target1 = 12;
        int result1 = search(arr, target1);
        logger.log(Level.INFO, "Element {0} is {1}",
                new Object[]{target1, result1 != -1 ? "present at index " + result1 : "not present"});

        int target2 = 91;
        int result2 = search(arr, target2);
        logger.log(Level.INFO, "Element {0} is {1}",
                new Object[]{target2, result2 != -1 ? "present at index " + result2 : "not present"});
    }

    /**
     * Searches for a target value in the given array.
     *
     * @param arr    array to search through
     * @param target value to search for
     * @return index of the target if found, -1 otherwise
     */
    public static int search(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            logger.log(Level.WARNING, "Empty or null array provided");
            return -1;
        }

        // Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // If the element matches the target, return its index
            if (arr[i] == target) {
                return i;
            }
        }

        // Target not found in the array
        return -1;
    }
}