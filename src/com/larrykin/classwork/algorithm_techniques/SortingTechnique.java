package com.larrykin.classwork.algorithm_techniques;

/**
 * Sorting Technique
 * Arranges elements in a specific order (ascending/descending).
 */
import java.util.Arrays;

public class SortingTechnique {
    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        sortArray(arr);
    }
}

