package com.example.classwork;

public class _2dArray {
    public static void main(String[] args) {
        String[][] cars = new String[2][2];
        cars[0][0] = "Volvo";
        cars[0][1] = "BMW";
        cars[1][0] = "Ford";
        cars[1][1] = "Mazda";

        for(int i= 0; i<cars.length; i++){
            System.out.println();
            for (int j=0; j<cars[i].length; j++){
                System.out.print(cars[i][j] + " ");
            }
        }
    }
}
