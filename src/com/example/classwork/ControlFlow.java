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
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;
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
    /*3. Leap Year Checker:
    Write a method called isLeapYear that takes a year as input and returns true if the year is a leap year and false otherwise.
    (A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.)*/
    public static boolean isLeapYear(){
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program checks if an year is a leap year.");
        System.out.print("Enter an year: ");
        year = scanner.nextInt();
        if(year % 4 == 0 || year % 100 == 0 && year % 400 ==0){
            return true;
        }else{
            return false;
        }

    }



    public static void main(String[] args) {
        System.out.println(isEven(5));
        System.out.println("〰️〰️〰️〰️〰️〰️〰️〰️Find the largest Number〰️〰️〰️〰️〰️〰️〰️〰️");
        findLargest();
        System.out.println("〰️〰️〰️〰️〰️〰️〰️〰️checks leap year〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️");
        boolean result=isLeapYear();
        System.out.println(result);

    }
}
