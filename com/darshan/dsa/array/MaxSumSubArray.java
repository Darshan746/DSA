package com.darshan.dsa.array;

/**
 * Find a Maximum Sum in the SubArray
 */
public class MaxSumSubArray {

    private static void findMaxSumSubArray(final int[] arr) {
        int max_sum_so_far = arr[0];
        int max_ending_here = 0;
        int start = 0, end = 0, s = 0;

        for (int i = 0; i < arr.length; i++) {
            max_ending_here += arr[i];
            if (max_ending_here > max_sum_so_far) {
                max_sum_so_far = max_ending_here;
                start = s;
                end = i;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
                s = i + 1;
            }
        }
        System.out.println("max Sum is " + max_sum_so_far);
        System.out.println("Starting from " + start + " " + " " + end);
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 2, 3, -2, -1};
        findMaxSumSubArray(arr);
    }
}
