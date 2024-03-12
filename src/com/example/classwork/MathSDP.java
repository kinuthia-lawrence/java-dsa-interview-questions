package com.example.classwork;

import java.util.Scanner;

public class MathSDP {
    /*create a program that prompts the user to enter two numbers and calculates their sum, difference
     * and products NB. use a different method for each calculation*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        sum(num1, num2);
        difference(num1, num2);
        product(num1, num2);
    }

    public static void sum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The sum of the two numbers is " + sum);
    }

    public static void difference(int num1, int num2) {
        int difference = num1 - num2;
        System.out.println("The difference of the two numbers is " + difference);
    }

    public static void product(int num1, int num2) {
        int product = num1 * num2;
        System.out.println("The product of the two numbers is " + product);
    }
}