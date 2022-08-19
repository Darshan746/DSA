package com.darshan.dsa.log2base2;

public class BuildMaxHeap {

    static void buildHeap(int[] arr, int size) {
        for (int i = size / 2; i >= 0; i--) {
            heapify(arr, i, size);
        }
    }

    static void heapify(int[] arr, int index, int size) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        int max = index;

        if (left <= size && arr[left] > arr[max]) {
            max = left;
        }
        if (right <= size && arr[right] > arr[max]) {
            max = right;
        }

        if (index != max) {
            swap(arr, max, index);
            heapify(arr, max, size);
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {40, 30, 100, 80};
        System.out.println("before sorting!!!");
        for (int i : arr) {
            System.out.println(i);
        }

        buildHeap(arr, arr.length-1);

        System.out.println("After Sorting !!!");
        for (int i : arr) {
            System.out.println(i);
        }
    }


}
