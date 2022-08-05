package com.darshan.dsa.hashing;

/**
 * Given an integer array, print k-th distinct element in an array.
 * The given array may contain duplicates and the output should print k-th element among all unique elements.
 * If k is more than number of distinct elements, print -1.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * Input : arr[] = {1, 2, 1, 3, 4, 2},
 * k = 2
 * Output : 4
 * <p>
 * First non-repeating element is 3
 * Second non-repeating element is 4
 * <p>
 * Input : arr[] = {1, 2, 50, 10, 20, 2},
 * k = 3
 * Output : 10
 * <p>
 * Input : {2, 2, 2, 2},
 * k = 2
 * Output : -1
 */
public class KthDistinctElem {

    private static int getKthElement(int[] arr, int kthElem) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        if (map.size() < kthElem) {
            return -1;
        }
        int dist_count = 0;
        //1, 2, 1, 3, 4, 2
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1) {
                dist_count++;
            }
            if (dist_count == kthElem) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 4, 3, 2};
        System.out.println(getKthElement(arr, 2));
    }
}
