package com.larrykin.classwork.algorithm_techniques;

import java.util.Arrays;

public class TwoPointer {
    /**
     * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
     *
     */
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int[] expectedOutput = {0, 1, 4, 0, 3};
        int k = 5;
        int output = removeElement(nums, val);
        System.out.println(k == output);
    }

    private static int removeElement(int[] nums, int val) {
        int insertPosition = 0;
        for (int n : nums) {
            if (n != 2) {
                nums[insertPosition++] = n;
            }
        }
        System.out.println(Arrays.toString(nums));
        return insertPosition;
    }
}
