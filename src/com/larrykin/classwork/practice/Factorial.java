package com.larrykin.classwork.practice;

import java.util.Scanner;

public class Factorial {
    /*create a for loop that calculates the factorial of a number(n) entered by the user.
     * the factorial of n is the product of all positive integers up to n*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number to calculate Factorial : ");
        int number = scanner.nextInt();

        calculateFactorial(number);
        long startTime = System.nanoTime();
        int result = calculateUsingRecursiveMethod(number);
        long endtime = System.nanoTime();
        long duration = endtime - startTime;
        System.out.printf("Factorial(Recursive method) of %d is: %d in %d nanoseconds %n ", number, result, duration);
//TODO: compare their speed
    }

    private static void calculateFactorial(int number) {
        //using for loop
        long startTime = System.nanoTime();
        if (number < 1) return;
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        long endtime = System.nanoTime();
        long executionTime = endtime -startTime;
        System.out.printf("Factorial(for loop) of %d is: %d in %d nanoseconds %n ", number, factorial, executionTime);

    }

    private static int calculateUsingRecursiveMethod(int number) {
        //using a recursive function
        if (number <= 1) {
            return 1;
        }
        return number * calculateUsingRecursiveMethod(number - 1);
    }
}
