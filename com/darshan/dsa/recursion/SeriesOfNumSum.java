package com.darshan.dsa.recursion;

public class SeriesOfNumSum {


    private static int seriesOfNumSum(final Integer number) {
        if (number == 0) {
            return 0;
        }
        return seriesOfNumSum(number - 1) + number;
    }

    public static void main(String[] args) {
        System.out.println(seriesOfNumSum(4));
    }
}
