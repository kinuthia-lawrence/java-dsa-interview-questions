package com.larrykin.classwork.algorithms;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Binary Search is an efficient search algorithm that finds the position of a target value
 * within a sorted array. It compares the target value to the middle element of the array;
 * if they are unequal, the half in which the target cannot lie is eliminated and the search
 * continues on the remaining half until the target is found or the subarray is empty.
 *
 * Time Complexity: O(log n) where n is the number of elements in the array
 * Space Complexity: O(1) for iterative implementation, O(log n) for recursive implementation
 */
public class BinarySearch {

    static Logger logger = Logger.getLogger(BinarySearch.class.getName());

    public static void main(String[] args) {
        // Binary search requires a sorted array
        int[] arr = {11, 12, 22, 25, 34, 64, 90};
        logger.log(Level.INFO, "Sorted Array: {0}", Arrays.toString(arr));

        int target1 = 25;
        int result1 = searchIterative(arr, target1);
        logger.log(Level.INFO, "Element {0} is {1}",
                new Object[]{target1, result1 != -1 ? "present at index " + result1 : "not present"});

        int target2 = 91;
        int result2 = searchIterative(arr, target2);
        logger.log(Level.INFO, "Element {0} is {1}",
                new Object[]{target2, result2 != -1 ? "present at index " + result2 : "not present"});

        // Also demonstrate recursive approach
        logger.log(Level.INFO, "Using recursive approach:");
        result1 = searchRecursive(arr, target1, 0, arr.length - 1);
        logger.log(Level.INFO, "Element {0} is {1}",
                new Object[]{target1, result1 != -1 ? "present at index " + result1 : "not present"});
    }

    /**
     * Searches for a target value in a sorted array using iterative binary search.
     *
     * @param arr    sorted array to search through
     * @param target value to search for
     * @return index of the target if found, -1 otherwise
     */
    public static int searchIterative(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            logger.log(Level.WARNING, "Empty or null array provided");
            return -1;
        }

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // Calculate middle index (avoiding potential integer overflow)
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target is greater, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        // Target not found in the array
        return -1;
    }

    /**
     * Searches for a target value in a sorted array using recursive binary search.
     *
     * @param arr    sorted array to search through
     * @param target value to search for
     * @param left   left index of the current subarray
     * @param right  right index of the current subarray
     * @return index of the target if found, -1 otherwise
     */
    public static int searchRecursive(int[] arr, int target, int left, int right) {
        if (arr == null || arr.length == 0) {
            logger.log(Level.WARNING, "Empty or null array provided");
            return -1;
        }

        // Base case: element not found
        if (left > right) {
            return -1;
        }

        // Calculate middle index (avoiding potential integer overflow)
        int mid = left + (right - left) / 2;

        // If element is present at the middle
        if (arr[mid] == target) {
            return mid;
        }

        // If element is smaller than mid, search in left subarray
        if (arr[mid] > target) {
            return searchRecursive(arr, target, left, mid - 1);
        }

        // If element is larger than mid, search in right subarray
        return searchRecursive(arr, target, mid + 1, right);
    }
}