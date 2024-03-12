package com.example.classwork;

import java.util.Scanner;

public class ControlFlow {
 /*   1. Even or Odd Checker:
    Write a method called isEven that takes an integer as input and returns true if the number is even and false otherwise.*/
    public static boolean isEven(int number){
        return number % 2 == 0;// you can also use if statement
    }

    public static void main(String[] args) {
        System.out.println(isEven(5));

    }
}
