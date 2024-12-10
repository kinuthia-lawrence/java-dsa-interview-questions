package com.larrykin.classwork.practice;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your Grade");
        int grade = scanner.nextInt();

       if (grade >= 90 && grade <= 100) {
                System.out.println("Hello " + name + " your marks is " + grade + " and your grade is A");
            } else if (grade >= 80 && grade < 90) {
                System.out.println("Hello " + name + " your marks is " + grade + " and your grade is B");
            } else if (grade >= 70 && grade < 80) {
                System.out.println("Hello " + name + " your marks is " + grade + " and your grade is C");
            } else if (grade >= 60 && grade<70) {
                System.out.println("Hello " + name + " your marks is " + grade + " and your grade is D");
            } else {
                System.out.println("Hello " + name + " your marks is " + grade + " and your grade is E");
            }
    }
}
