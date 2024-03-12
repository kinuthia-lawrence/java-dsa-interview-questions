package com.example.classwork;

import java.util.Scanner;

public class CalculateGrade {
    // program to implement grade conversion using switch statement
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char grade = scanner.next().charAt(0);
        convertGrade(grade);

    }

    public static void convertGrade(char grade) {
        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("Excellent");
                break;
            case 'B':
            case 'b':
                System.out.println("Good");
                break;
            case 'C':
            case 'c':
                System.out.println("Average");
                break;
            case 'D':
            case 'd':
                System.out.println("Below Average");
                break;
            case 'F':
            case 'f':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade!!");
        }
    }
}
