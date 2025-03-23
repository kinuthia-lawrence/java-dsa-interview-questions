package com.larrykin.classwork.dataStructures.arrays;

public class SmallestValue {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 6, 7, 7, 5, 9, 1, 10};
        System.out.println(findTheSmallestValue(arr));

    }

    // finding the smallest value in an array
    // Runtime complexity of 0(n)
    private static int findTheSmallestValue(int[] array) {
        /*steps
         * create a variable and store the first element in the array.
         * Iterate through the array and compare the value of the variable with the current element in the array.
         * If the current value is smaller than the variable, update the variable with the current value.
         *
         * Variable 'minVal' = array[0]
         * For each element in the array
         * If current element < minVal
         * minVal = current element
         * */
        int smallest = array[0];
        for (int value : array) {
            if (value < smallest) {
                smallest = value;
            }
        }
        return smallest;
    }
}
