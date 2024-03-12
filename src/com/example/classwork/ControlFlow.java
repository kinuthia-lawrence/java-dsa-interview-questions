package com.example.classwork;

import java.util.Scanner;

public class ControlFlow {
 /*   1. Even or Odd Checker:
    Write a method called isEven that takes an integer as input and returns true if the number is even and false otherwise.*/
    public static boolean isEven(int number){
        return number % 2 == 0;// you can also use if statement
    }
/*2. Largest of Three Numbers:
    Write a method called findLargest that takes three integers as input and returns the largest of the three numbers.*/
    public static void findLargest(){
        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("A program to compaire three numbers ans returns the largest of the three numbers💪💪");
        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();
         System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();
         System.out.print("Enter the third number: ");
        num3 = scanner.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is the largest");
        }else if(num2 > num1 && num2 >num3){
                System.out.println(num2 +" is the Largest");

        }else{
            System.out.println(num3 + " is the Largest");
        }

    }


    public static void main(String[] args) {
        System.out.println(isEven(5));
        System.out.println("Find the largest Number");
        findLargest();

    }
}
