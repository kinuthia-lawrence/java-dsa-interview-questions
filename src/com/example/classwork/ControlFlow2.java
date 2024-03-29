package com.example.classwork;

public class ControlFlow2 {
    /*1.Number In Word
    Write a method called printNumberInWord. The method has one parameter number which is the whole number.
    The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number
    is 0, 1, 2, .... 9 or other for any other number including negative numbers.
    You can use if-else statement or switch statement whatever is easier for you.*/
    public static void printNumberInWord(int num){
        switch (num){
            case 0:
                System.out.println("Zero");
                break;

            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            case 3:
                System.out.println("Three");
                break;

            case 4:
                System.out.println("Four");
                break;

            case 5:
                System.out.println("Five");
                break;

            case 6:
                System.out.println("Six");
                break;

            case 7:
                System.out.println("Seven");
                break;

            case 8:
                System.out.println("Eight");
                break;

            case 9:
                System.out.println("Nine");
                break;

            case -1:
                System.out.println("Negative One");
                break;

            case -2:
                System.out.println("Negative Two");
                break;

            case -3:
                System.out.println("Negative Three");
                break;

            case -4:
                System.out.println("Negative Four");
                break;

            case -5:
                System.out.println("Negative five");
                break;

            case -6:
                System.out.println("Negative Six");
                break;

            case -7:
                System.out.println("Negative Seven");
                break;

            case -8:
                System.out.println("Negative Eight");
                break;

            case -9:
                System.out.println("Negative Nine");
                break;
            default:
                System.out.println("Invalid number");
        }

    }
/*2. Number Of Days In Month
    Write a method isLeapYear with a parameter of type int named year.
    The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
    If the parameter is not in that range return false.
    Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.
    A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
    Examples of input/output:
    isLeapYear(-1600); →  should return false since the parameter is not in the range (1-9999)
    isLeapYear(1600); → should return true since 1600 is a leap year*/
    public static boolean isLeapYear(int year){
        if (year >= 1 && year <=9999){
            return year % 4 ==0 || year % 100 == 0 && year % 400 == 0;
        }else{
            return false;
        }
    }

    /*3. First And Last Digit Sum
        Write a method named sumFirstAndLastDigit with one parameter of type int called number.
        The method needs to find the first and the last digit of the parameter number passed to the method,
         using a loop and return the sum of the first and the last digit of that number.
        If the number is negative then the method needs to return -1 to indicate an invalid value.
        Example input/output
        sumFirstAndLastDigit(252); → should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.*/
    public static void sumFirstAndLastDigit(int number){
        int lastDigit = number % 10;
        int firstDigit = 0;
        if (number < 0){
            System.out.println(-1);
        }else{
            while (number > 0){
                firstDigit = number % 10;
                number /= 10;
            }
            System.out.println(firstDigit + lastDigit);
        }

    }
/*implement the above method by taking a number and first converting it to string and then to char array
        then get the first and last element of the array and convert them to int and add them together and return the sum
        * */
    public static int sumFirstAndLastDigit2(int number){
        //convert to string
        String num = Integer.toString(number);
        //convert to char array
        char[] numArray = num.toCharArray();

        int firstDigit = Character.getNumericValue(numArray[0]);
        int lastDigit = Character.getNumericValue(numArray[numArray.length - 1]);
        return firstDigit + lastDigit;
    }



/*4. Greatest Common Divisor
        Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
            If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
            The method should return the greatest common divisor of the two numbers (int).
            The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).
            For example 12 and 30:
                    12 can be divided by 1, 2, 3, 4, 6, 12
                    30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30
            The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder.
        */
    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }else{
            int gcd = 1;
            for (int i = 1; i <= first && i <= second; i++){
                if (first % i == 0 && second % i == 0){
                    gcd = i;
                }
            }
            return gcd;
        }
    }

    /*    5. Number Of Days In Month
Write a method isLeapYear with a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false.
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
Examples of input/output:
isLeapYear(-1600); →  should return false since the parameter is not in the range (1-9999)
isLeapYear(1600); → should return true since 1600 is a leap year
isLeapYear(2017); → should return false since 2017 is not a leap year
isLeapYear(2000); → should return true because 2000 is a leap year*/
    public static boolean isLeapYear2(int year){
        if (year >= 1 && year <=9999){
            return year % 4 ==0 || year % 100 == 0 && year % 400 == 0;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️This is the print number in Words");
        printNumberInWord(-3);
        System.out.println("〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️This program checks leap year");
        boolean isLeapYear = isLeapYear(2022);
        System.out.println(isLeapYear);
        System.out.println("〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️This program sums the first and the last numbers of a given number");
        sumFirstAndLastDigit(352);
        System.out.println("〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️This program returns the gcd of two numbers");
        int gcd = getGreatestCommonDivisor(12,30);
        System.out.println(gcd);


    }
}
