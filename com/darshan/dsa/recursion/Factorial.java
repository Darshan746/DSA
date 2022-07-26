package com.darshan.dsa.recursion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorialOfNumber(5));
    }

    private static int factorialOfNumber(int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorialOfNumber(number - 1);
    }
}
