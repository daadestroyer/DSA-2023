package com.math;

public class PallindromeString {

    static boolean isPallindrome(String s) {
        int low = 0;
        int hi = s.length() - 1;

        if (s.length() == 0 || s.charAt(low) != s.charAt(hi)) {
            return false;
        }
        while (low <= hi) {
            if (s.charAt(low) != s.charAt(hi)) {
                return false;
            }
            low++;
            hi--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "";
        if (isPallindrome(s)) {
            System.out.println("pallindrome");
        } else {
            System.out.println("not pallindrome");
        }
    }
}
