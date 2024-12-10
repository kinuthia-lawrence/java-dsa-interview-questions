package com.larrykin.classwork.practice;

public class Main {
    public static void main(String[] args) {
        fibonacciSeries(8);

    }
//    fibonacci(10);
//    we need two numbers
//   third number = first number + second number
//    swap the numbers
    public static void fibonacciSeries(int count){
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.println(firstNumber + " " + secondNumber);
        for (int i=2; i< count; i++){
            int thirdNumber = firstNumber + secondNumber;
//            swap
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            System.out.println(thirdNumber + " ");

        }
    }
}
