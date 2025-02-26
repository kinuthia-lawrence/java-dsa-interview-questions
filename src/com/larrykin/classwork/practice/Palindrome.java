package com.larrykin.classwork.practice;

import java.util.Objects;
import java.util.Scanner;

public class Palindrome {
    //Palindrome - a word, phrase, or sequence that reads the same backwards as forwards

    public static void main(String[] args) {
        String word;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter a word to check if it is a palindrome: ");
            word = scanner.nextLine();
            if (word != null && word.equals(new StringBuilder(word).reverse().toString())) {
                System.out.println("The word is a palindrome");
            } else {
                System.out.println("The word is not a palindrome");
            }
        } while (!Objects.equals(word, "exit"));


    }
}
