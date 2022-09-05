package com.darshan.dsa.log2base2;

public class MinHeap {
    static void buildHeap(int[] arr, int size) {

        //size/2 is for getting the bottom most subtree node
        for (int i = size / 2; i >= 0; i--) {
            heapify(arr, i, size);
        }
    }

    static void heapify(int[] arr, int index, int size) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        int min = index;

        if (left <= size && arr[left] < arr[index]) {
            min = left;
        }
        if (right <= size && arr[right] < arr[min]) {
            min = right;
        }

        if (index != min) {
            swap(arr, min, index);
            heapify(arr, min, size);
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {50,70,8,90,5};
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
