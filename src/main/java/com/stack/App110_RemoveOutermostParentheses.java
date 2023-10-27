package com.stack;

import java.util.Stack;

public class App110_RemoveOutermostParentheses {
    public static void main(String[] args) {
        String s = "(()())(())";
        StringBuilder sb = new StringBuilder();
        Stack st = new Stack();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (st.size() > 0) {
                    sb.append(s.charAt(i));
                }
                st.push(s.charAt(i));
            } else {
                st.pop();
                if (st.size() > 0) {
                    sb.append(s.charAt(i));
                }
            }
        }

        System.out.println(sb.toString());
    }
}
