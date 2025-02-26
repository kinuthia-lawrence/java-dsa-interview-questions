package com.larrykin.classwork.practice;

public class _2dArray {
    public static void main(String[] args) {
        String[][] cars = new String[2][2];
        cars[0][0] = "Volvo";
        cars[0][1] = "BMW";
        cars[1][0] = "Ford";
        cars[1][1] = "Mazda";

        for (String[] car : cars) {
            System.out.println();
            for (String s : car) {
                System.out.print(s + " ");
            }
        }
    }
}
