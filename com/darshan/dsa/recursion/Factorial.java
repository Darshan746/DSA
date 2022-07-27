package com.darshan.dsa.recursion;

import java.util.Map;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorialOfNumber(5));
        System.out.println(Math.max(1,55));
    }

    private static int factorialOfNumber(int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorialOfNumber(number - 1);
    }
}
