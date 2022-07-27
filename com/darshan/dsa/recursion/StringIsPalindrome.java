package com.darshan.dsa.recursion;

public class StringIsPalindrome {


    private static String getReversedString(final String str){
        if(str.length()==1){
            return str;
        }
        return str.charAt(str.length()-1)+getReversedString(str.substring(0, str.length()-1));
    }

    public static void main(String[] args) {
        final String stringToBeTest = "aba";
        if (stringToBeTest.equals(getReversedString(stringToBeTest))) {
            System.out.println("Yes Given String is Palindrome!");
        } else {
            System.out.println("Given String is Not palindrome");
        }
    }
}
