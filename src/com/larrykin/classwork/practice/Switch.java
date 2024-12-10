package com.larrykin.classwork.practice;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day of the week. i.e 1,2,3,4...");
        int day = input.nextInt();
         switch (day){
             case 1 -> System.out.println("Mon");
             case 2 -> System.out.println("Tue");
             case 3 -> System.out.println("Wed");
             case 4 -> System.out.println("Thur");
             default -> System.out.println("NO such day");


        }
    }
}
