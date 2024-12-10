package com.larrykin.classwork.practice;

import java.util.Scanner;

public class AreaOfACircle {
    /*Write a program that takes the radius of a circle as the input from the user and calculates the area and circumference of the circle*/
    public static String calculateAreaAndCircumference(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        return "The area of the circle is " + area + " and the circumference of the circle is " + circumference;
    }

    public static void main(String[] args) {
        String result = calculateAreaAndCircumference();
        System.out.println(result);
    }
}
