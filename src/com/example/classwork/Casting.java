package com.example.classwork;

public class Casting {
    /*
    * casting is converting a variable from one data type to another
    *
    * */
    public static void main(String[] args) {
//        implicit/windening - converting from a small data type to a larger data type---to prevent loss of data and compactibility.
        int number1 = 10;
        double number2 = number1;
        System.out.println(number2);
        System.out.println(number1);
//        explicit/narrowing - converting from a larger data type to a smaller data type
        double num =3.0d;
        int num1 = (int)num;
        System.out.println(num);
        System.out.println(num1);


//        Type promotion - the results should be of the larger data type
        double sum = num + num1;
        float num2 = 10.9f;
        System.out.println(sum);

//        Methods in java-are blocks of code that perform a specific tasks and can be used in  from other parts
        /*
        * it should have: access modifier, return type,method name, parameter list, body of the method.if it has a return type, we have to return something
        * static method belogs to the main class
        * instance method -associated with instance of a class
        * it is created ouside the main method but inside the class
        * */

        printHelloWorld();
        int total =add(3,40);
        System.out.println(total);
        System.out.println(add(4,5));
product(6,5);

int[] arr = {1,2,3,4,5,6,7,8,9};
evenNumbers(arr);






    }
    public static void printHelloWorld(){
        System.out.println("i am a method printing hello world");
    }
    public static int add(int a, int b){
        return a + b;
    }
    public static void product(double num, int num2){
        System.out.println("Multiplying two numbers: "+ " "+ num +" " + num2);
        double prod = num * num2;
        System.out.println("the product is : "+ prod);
    }
    public static void evenNumbers(int[] arr){
//        iterate through the array list
        for(int i=0; i<arr.length; i++){
//            check if even
            if(arr[i] % 2 == 0){
                System.out.println(arr[i]+ " ");
            }
        }
    }
}
