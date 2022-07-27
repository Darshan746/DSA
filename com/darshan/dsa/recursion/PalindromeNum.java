package com.darshan.dsa.recursion;

public class PalindromeNum {

    private static int reverseNum(int  num, int rem){
        if(num==0){
            return rem;
        }
        rem =(rem*10)+(num%10);
       return reverseNum(num/10, rem);
    }

    public static void main(String[] args) {
        int checkThisNoIsPalindromeOrNot = 111;
       int number =  reverseNum(checkThisNoIsPalindromeOrNot, 0);
       if(checkThisNoIsPalindromeOrNot == number){
           System.out.println("yes it is Palindrome");
       }
       else
           System.out.println("It's Not palindrome");
    }
}
