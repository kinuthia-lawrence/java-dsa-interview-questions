package com.larrykin.classwork.practice;

public class Fibonacci {
    /*write a program that uses a while loop to print the fibonnacci sequence upto the tenth term*/
    public static void main(String[] args) {
        //TODO: finish this program.
        int n = 10; // Number of terms to print
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci sequence upto the tenth term:");

        int count = 0;
        while (count < n) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

            count++;
        }
    }
}
