package com.example.classwork;

public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

//        int size = 10; // Size of the multiplication table (e.g., 10x10)
//
//        // Nested loop to iterate through rows and columns
//        for (int i = 1; i <= size; i++) {
//            for (int j = 1; j <= size; j++) {
//                // Calculate and print the product of row and column
//                System.out.print(i * j + "\t");
//            }
//            System.out.println(); // Move to the next line after each row
//        }

        int number=5;
        while (number<10){
            System.out.println(number);
            number++;
        }

        int num = 5;
        do{
            System.out.println("i am less than 2");
            num ++;
        }while(num < 10);


//
    }
}