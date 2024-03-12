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
    /*4. Grading System:
    Write a method called calculateGrade that takes a student's score as input and returns a letter grade based on the following grading scale:
    A: 90-100
    B: 80-89
    C: 70-79
    D: 60-69
    F: Below 60*/
    public static char calculateGrade() {
        double score;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        score = scanner.nextDouble();

        // Validate input score
        if (score < 0 || score > 100) {
            System.out.println("Invalid Score!!");
            return 'E'; // Return 'E' for invalid score
        }

        // Calculate grade based on score
        if (score >= 90 && score <= 100) {
            return 'A';
        } else if (score >= 80 && score <= 89) {
            return 'B';
        } else if (score >= 70 && score <= 79) {
            return 'C';
        } else if (score >= 60 && score <= 69) {
            return 'D';
        } else {
            return 'F';
        }

    }

/*
5. Triangle Type Checker:
    Write a method called classifyTriangle that takes the lengths of three sides of a triangle as input and
    returns a string indicating the type of triangle (equilateral, isosceles, scalene) or if the inputs do not form a valid triangle.
*/
    public static String classifyTriangle(){
        int side1, side2, side3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of side 1: ");
        side1 = scanner.nextInt();
        System.out.print("Enter the length of side 2: ");
        side2 = scanner.nextInt();
        System.out.print("Enter the length of side 3: ");
        side3 = scanner.nextInt();
        if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1){
            if(side1 == side2 && side2 == side3){
                return "Equilateral";
            }else if(side1 == side2 || side2 == side3 || side1 == side3){
                return "Isosceles";
            }else{
                return "Scalene";
            }
        }else{
            return "Not a valid triangle";
        }
    }

             /* {

6. Temperature Converter:
Write a method called convertTemperature that takes a temperature in Celsius as input and converts it to Fahrenheit.
Include an optional boolean parameter to specify whether the input temperature is in Celsius or Fahrenheit, and return the converted temperature accordingly.

7. Number Sign Checker:
Write a method called checkSign that takes an integer as input and returns a string indicating whether the number is positive, negative, or zero.

8. Vowel or Consonant Checker:
Write a method called isVowel that takes a character as input and returns true if the character is a vowel and false otherwise.
Ignore case sensitivity.

9. Palindrome Checker:
Write a method called isPalindrome that takes a string as input and returns true if the string is a palindrome
(reads the same forwards and backwards) and false otherwise.
            }*/
    public static void main(String[] args) {
        System.out.println(isEven(5));
        System.out.println("〰️〰️〰️〰️〰️〰️〰️〰️Find the largest Number〰️〰️〰️〰️〰️〰️〰️〰️");
        findLargest();
        System.out.println("〰️〰️〰️〰️〰️〰️〰️〰️checks leap year〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️");
        boolean result=isLeapYear();
        System.out.println(result);
        System.out.println("〰️〰️〰️〰️〰️〰️〰️〰️calculate grade〰️〰️〰️〰️〰️〰️〰️〰️〰️");
        char grade = calculateGrade();
        System.out.println(grade);
        System.out.println("〰️〰️〰️〰️〰️〰️〰️〰️This program checks the type of a triangle.〰️〰️〰️〰️〰️〰️");
        String classifyTriangle =classifyTriangle();
        System.out.println(classifyTriangle);

    }
}
