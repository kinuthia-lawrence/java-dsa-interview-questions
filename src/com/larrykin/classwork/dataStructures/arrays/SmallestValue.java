package com.larrykin.classwork.dataStructures.arrays;

/**
 * A utility class to find the smallest value in an array.
 */
public class SmallestValue {

    /**
     * The main method to demonstrate finding the smallest value in an array.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 6, 7, 7, 5, 9, 1, 10};
        System.out.println(findTheSmallestValue(arr));
    }

    /**
     * Finds the smallest value in the given array.
     *
     * <p>Steps:
     * <ul>
     *     <li>Create a variable and store the first element in the array.</li>
     *     <li>Iterate through the array and compare the value of the variable with the current element in the array.</li>
     *     <li>If the current value is smaller than the variable, update the variable with the current value.</li>
     * </ul>
     * </p>
     *
     * @param array The array to search for the smallest value.
     * @return The smallest value in the array.
     * @throws IllegalArgumentException if the array is null or empty.
     */
    private static int findTheSmallestValue(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int smallest = array[0];
        for (int value : array) {
            if (value < smallest) {
                smallest = value;
            }
        }
        return smallest;
    }
}
