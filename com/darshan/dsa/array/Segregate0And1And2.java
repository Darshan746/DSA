package com.darshan.dsa.array;

import java.util.Arrays;

public class Segregate0And1And2 {

    private static void segregateArray(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    mid++;
                    low++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 1, 2};
        segregateArray(arr);
    }
}
