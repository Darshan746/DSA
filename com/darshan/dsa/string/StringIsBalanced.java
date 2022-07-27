package com.darshan.dsa.string;

import java.util.Stack;

public class StringIsBalanced {

    private static boolean isStringIsBalanced(final String str) {
        Stack<Character> stack = new Stack<>();
        char[] chars=str.toCharArray();

        for(int i = 0; i<chars.length;i++){
            switch (chars[i]){
                case '[':
                case '{':
                case '(':
                    stack.push(chars[i]);
                    break;
                case ']':
                    if(stack.pop()!='['){
                        return false;
                    }break;
                case '}':
                    if(stack.pop()!='{'){
                        return false;
                    }
                    break;
                case ')':
                    if(stack.pop()!='('){
                        return false;
                    }
                    break;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isStringIsBalanced("(abc){)"));
    }

}
