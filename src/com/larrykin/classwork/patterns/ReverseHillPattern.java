package com.larrykin.classwork.patterns;

public class ReverseHillPattern {
    public static void main(String[] args) {
        /**
         * It is made up of one increasing triangle(spaces) and two decreasing triangles(characters)
         *   * * * * *
         *    * * * *
         *     * * *
         *      * *
         *       *
         *
         * */
        int n = 5;
        long start1 = System.nanoTime();
        method1(n);
        long end1 = System.nanoTime();
        System.out.println("Method1 time:: " + (end1 - start1) + " ns");

        long start2 = System.nanoTime();
        method2(n);
        long end2 = System.nanoTime();
        System.out.println("Method2 time:: " + (end2 - start2) + " ns");
    }

    static void method1(int n) {
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < row; space++) {
                System.out.print("  ");
            }
            for (int col = 0; col < n - row; col++) {
                System.out.print("* ");
            }
            for (int col = 1; col < n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void method2(int n) {
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < row; space++) {
                System.out.print("  ");
            }
            for (int col = 0; col < (2 * (n - row)) - 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
