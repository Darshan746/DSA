package com.darshan.dsa.array;

public class SubArrayWithGivenSum {

    static void printSubArrayWithGivenSum(int[] arr, int givenSum) {
        int current_sum = arr[0];
        int start = 0;
        int end = 0;
        while (end < arr.length) {
            if (current_sum == givenSum) {
                printArray(arr, start, end);
            }
            if (current_sum <= givenSum) {
                end++;
                if (end < arr.length) {
                    current_sum += arr[end];
                }
            } else {
                current_sum -= arr[start];
                start++;
            }
        }
    }

    public static void printArray(int[] array, int startRange, int endRange) {
        for (int i = startRange; i <= endRange; i++) {
            System.out.print(array[i] + " " + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 5, 6};
        printSubArrayWithGivenSum(arr, 6);
    }
}
