package com.larrykin.classwork;

import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt(); // prompt the user to enter the start of the range

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt(); // prompt the user to enter the end of the range

        System.out.println("Even numbers:");
        for (int i = start; i <= end; i++) {
            // Check if the number is divisible by 2
            // If the number leaves a remainder of 0 when divided by 2, it is even
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nOdd numbers:");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {  // Check if the number is not divisible by 2
                System.out.print(i + " ");
            }
        }
    }
}















