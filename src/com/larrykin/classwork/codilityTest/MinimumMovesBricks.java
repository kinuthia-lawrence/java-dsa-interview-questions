package com.larrykin.classwork.codilityTest;

import java.lang.reflect.Array;

/**
 * There are N boxes (numbered from 0 to N-1) arranged in a row. The K-th box contains A[K] bricks. In one move you can take one brick from some box and move it to a box next to it (on the left or on the right). What is the minimum number of moves needed to end up with exactly 10 bricks in every box?
 * <p>
 * Write a function:
 * function solution (A);
 * that, given an array A of N integers, returns the minimum number of moves needed to end up with exactly 10 bricks in every box. If this is not possible, the function should return - 1.
 * Examples:
 * 1. For A = [7, 15, 10, 8], the function should return 7. You can perform the following sequence of moves:
 * • move three bricks from box number 1 to the box on the left: [10, 12, 10, 8];
 * • move two bricks from box number 1 to the box on the right: [10, 10, 12, 81;
 * • finally, move two bricks from box number 2 to the last box: [10, 10, 10, 10].
 * 2. For A = [11, 10, 8, 12, 8, 10, 11], the function should return 6. You can perform the following sequence of moves:
 * • move a brick from box number 0 to box number 2 (using two moves);
 * • move a brick from the last box two positions to the left (using two moves);
 * • move a brick from the middle box to each of its neighbors (another two moves).
 * 3. For A = [7, 14, 10], the function should return - 1. It is not possible to end up with exactly 10 bricks in each box.
 * Assume that:
 * • N is an integer within the range [1..20];
 * • each element of array A is an integer within the range [0..200].
 */
public class MinimumMovesBricks {
    public static void main(String[] args) {
        int[] A1 = {7, 15, 10, 8};
        System.out.println(solution(A1)); // Output: 7

        int[] A2 = {11, 10, 8, 12, 8, 10, 11};
        System.out.println(solution(A2)); // Output: 6

        int[] A3 = {7, 14, 10};
        System.out.println(solution(A3)); // Output: -1
    }

    public static int solution(int[] A) {
        int N = A.length;
        int totalBricks = 0;
        for (int bricks : A) {
            totalBricks += bricks;
        }
        if (totalBricks != N * 10) {
            return -1;
        }
        int moves = 0;
        int excessBrick = 0;

        for (int bricks : A) {
            excessBrick += bricks - 10;
            moves += Math.abs(excessBrick);
        }

        return moves;
    }
}
