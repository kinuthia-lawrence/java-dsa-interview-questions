package com.larrykin.classwork.practice;

public class Stars {
//    Write a method named printSquareStar with one parameter of type int named number.
//    If number is < 5, the method should print "Invalid Value".
//    The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).
//    EXAMPLE
//    printSquareStar(8); should print the following:
//
//            ********
//            **    **
//            * *  * *
//            *  **  *
//            *  **  *
//            * *  * *
//            **    **
//            ********

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 0; row < number; row++) { // Outer loop for rows
                for (int col = 0; col < number; col++) { // Inner loop for columns
                    // Check for top and bottom rows or left and right columns
                    if (row == 0 || col == 0 || row == number - 1 || col == number - 1) {
                        System.out.print("*"); // Print * for rectangle border
                    } else if (row == col || col == number - 1 - row) { // Check for diagonals
                        System.out.print("*"); // Print * for diagonal
                    } else {
                        System.out.print(" "); // Print space for other positions
                    }
                }
                System.out.println(); // Move to the next line
            }
        }
    }

    public static void main(String[] args) {
        printSquareStar(8);
    }
}
