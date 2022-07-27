package com.darshan.dsa.array;

import java.util.*;

public class SortArrayByFrequencyOfElements {


    public static void main(String[] args) {

        int[] arr = {1, 1, 3, 2, 2, 2, 3, 4};
        sortArrayByFrequency(arr);

    }


    private static void sortArrayByFrequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
            intList.add(arr[i]);
        }
        SortedComparator sortedComparator = new SortedComparator(map);
        intList.sort(sortedComparator);
        intList.forEach(a -> System.out.print(a));
    }

}


class SortedComparator implements Comparator<Integer> {
    Map<Integer, Integer> map;

    SortedComparator(Map<Integer, Integer> map) {
        this.map = map;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        int frequencyCompare = map.get(o2).compareTo(map.get(o1));
        int valueCompare = o1.compareTo(o2);
        if (frequencyCompare == 0) {
            return valueCompare;
        } else return frequencyCompare;
    }
}