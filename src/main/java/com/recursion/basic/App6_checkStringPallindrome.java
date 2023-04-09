package com.recursion.basic;

public class App6_checkStringPallindrome {
    static boolean pallindrome(String s, int lo, int hi) {
        if (lo >= hi) {
            return true;
        }
        if (s.charAt(lo) != s.charAt(hi))
            return false;
        else
            return pallindrome(s, lo + 1, hi - 1);
    }

    public static void main(String[] args) {
        String s = "arora";
        System.out.println(pallindrome(s, 0, s.length() - 1));
    }
}
