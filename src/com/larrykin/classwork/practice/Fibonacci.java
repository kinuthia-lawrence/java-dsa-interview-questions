package com.larrykin.classwork.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {
    //    fibonacci - a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding ones, usually starting with 0 and 1.
    public static void main(String[] args) {
//        createFibonacci(10);
        sumFibonacci(10);
    }


    //? creating a fibonacci sequence
    private static void createFibonacci(int end) {
        //convert array to Arraylist
        ArrayList<Integer> sequence = new ArrayList<>(Arrays.asList(0, 1));
        int size = sequence.size();

        //append values to the ArrayList
        while (size < end) {
            int nextValue = sequence.get(size - 1) + sequence.get(size - 2);
            sequence.add(nextValue);
            size++;
        }

        //convert ArrayList back to array
        int[] sequenceArray = sequence.stream().mapToInt(i -> i).toArray();
        System.out.println("Fibonacci:: " + Arrays.toString(sequenceArray));
    }

    private static void sumFibonacci(int end) {
        int firstTerm = 0;
        int secondTerm = 1;
        int sum = firstTerm + secondTerm;
        System.out.printf("Fibonacci sequence upto the %s th term: ", end);

        int count = 0;
        while (count < end) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

            count++;
            sum += nextTerm;
        }
        System.out.printf("\nSum: %s", sum);
    }
}
