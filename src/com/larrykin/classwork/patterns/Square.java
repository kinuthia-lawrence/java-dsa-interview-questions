package com.larrykin.classwork.patterns;

public class Square {
    public static void main(String[] args) {
        /**
         *
         * 2 2 2 2 2
         * 2 1 1 1 2
         * 2 1 0 1 2
         * 2 1 1 1 2
         * 2 2 2 2 2
         *
         * */
        int n = 5;
        method1(n);
    }

    static void method1(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
