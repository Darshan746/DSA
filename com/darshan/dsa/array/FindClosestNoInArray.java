package com.darshan.dsa.array;

/**
 * Given an array arr[] consisting of N integers and an integer K,
 * the task is to find the array element closest to K.
 * If multiple closest values exist, then print the smallest one.
 * <p>
 * Input: arr[]={4, 2, 8, 11, 7}, K = 6
 * Output: 7
 */

public class FindClosestNoInArray {

    private static void findClosestElement(int[] arr, int targetElement) {

        int closestElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(targetElement - closestElement) > Math.abs(targetElement - arr[i])) {
                closestElement = arr[i];
            }
        }
        System.out.println("closest element for  target elem " + targetElement + " " + " " + "is" + " " + closestElement);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 8, 11, 7};
        findClosestElement(arr, 6);
    }
}
