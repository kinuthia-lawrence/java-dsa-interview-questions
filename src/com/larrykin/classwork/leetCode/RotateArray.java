package com.larrykin.classwork.leetCode;

/**
 * Problem: Rotate an array of n elements to the right by k steps. For example, with n
 * = 7 and k =3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        solution1(array, 3); // Intermediate Array
        solution2(array, 7); // Bubble Rotate
        solution3(array, 3); // Reversal
    }

    private static void solution1(int[] nums, int k) {
        /*we can create a new array and then copy elements to the
 new array. Then change the original array by using System.arraycopy()
 *Space is O(n) and time is O(n).
 */
        if (k > nums.length) {
            k = k % nums.length;
        }
        //create new array
        int[] result = new int[nums.length];

        //? rotate the elements to the right by k steps.
//        for (int i = 0; i < k; i++) {
//            result[i] = nums[nums.length - k + i];
//        }
        if (k >= 0) System.arraycopy(nums, nums.length - k, result, 0, k);
        int j = 0;
        //? copy the other elements
        for (int i = k; i < nums.length; i++) {
            result[i] = nums[j];
            j++;
        }
//? copy back the results to nums
        System.arraycopy(result, 0, nums, 0, nums.length);

        //printing
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();

    }

    private static void solution2(int[] nums, int order) {
        /*like a bubble sort.
         *  O(1) space, time O(n*k).
         * */
        if (nums == null || order < 0) {
            throw new IllegalArgumentException("Illegal arguments!");
        }

        for (int i = 0; i < order; i++) {
            for (int j = nums.length - 1; j > 0; j--) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
            }
        }

        //printing
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    private static void solution3(int[] nums, int order) {
        /*Assuming we are given 1,2,3,4,5,6 and order 2.The basic idea is:
 1.Divide the array two parts: 1,2,3,4 and 5,6
 2.Rotate first part: 4,3,2,1,5,6
 3.Rotate second part: 4,3,2,1,6,5
 4.Rotate the whole array: 5,6,1,2,3,4
 * O(1) space and O(n)time.
 */
//        order = order % nums.length;
        if (nums == null || order < 0) {
            throw new IllegalArgumentException("Illegal arguments");
        }

        //first part of array
        int fPart = nums.length - order;

        reverseNums(nums, 0, fPart - 1);
        reverseNums(nums, fPart, nums.length - 1);
        reverseNums(nums, 0, nums.length - 1);
    }

    private static void reverseNums(int[] nums, int left, int right) {
        if (nums == null || nums.length == 1) return;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();

    }

}
