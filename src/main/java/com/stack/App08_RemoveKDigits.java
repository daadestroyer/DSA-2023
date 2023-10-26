package com.stack;

import java.util.Stack;

public class App08_RemoveKDigits {

    public static String removeKdigits(String S, int k) {
        Stack<Character> st = new Stack<>();
        int n = S.length();

        for (int i = 0; i < n; i++) {
            while (k > 0 && !st.isEmpty() && st.peek() > S.charAt(i)) {
                st.pop();
                k--;
            }
            st.push(S.charAt(i));
        }
        // for example s = "112" k = 1
        // let's suppose if stack is already monotonic increasing then we cant perform anything
        // then in this case if k is still > 0 then remove all the k value from the top of stack

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();

        while(sb.length() > 1 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String num = "10";
        int k = 2;
        System.out.println(removeKdigits(num, k));

    }
}
