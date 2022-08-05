package com.darshan.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, and a number ‘sum’,
 * find the number of pairs of integers in the array whose sum is equal to ‘sum’.
 */
// Sum =A+B
// A = Sum-B;
public class CountPairWithGivenSum {

    public static void countAndPrintGivenSumPair(int[] arr, int givenSum) {
        final Map<Integer, Integer> map = new HashMap<>();
        int pairCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
            if (map.containsKey(givenSum - arr[i])) {
                System.out.println(givenSum - arr[i] + " " + arr[i]);
                pairCount += map.get(arr[i]);
            }
        }
        System.out.println("No Of Pairs is " + pairCount);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 5};
        countAndPrintGivenSumPair(arr, 7);
    }
}

