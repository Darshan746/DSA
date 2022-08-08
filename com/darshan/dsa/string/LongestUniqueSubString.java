package com.darshan.dsa.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestUniqueSubString {
    private static void getLongestUniqueSubString(final String str) {
        String longestSubString = null;
        int longestSubStringLength = 0;
        final Map<Character, Integer> map = new LinkedHashMap<>();
        char[] chars = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(chars[i])) {
                map.put(chars[i], i);
            } else {
                i = map.get(chars[i]);
                map.clear();
            }
            if (map.size() > longestSubStringLength) {
                longestSubStringLength = map.size();
                longestSubString = map.keySet().toString();
            }
        }
        System.out.println("Longest SubString Length " + longestSubStringLength);
        System.out.println("Longest SubString" + " " + longestSubString);
    }

    public static void main(String[] args) {
        getLongestUniqueSubString("Darshan");
    }
}
