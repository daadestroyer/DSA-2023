package com.math;

public class CheckPallindromeNo {
    public static void main(String[] args) {
        int num = 121;
        int originalNo = num;
        int revNo = 0;

        while (num != 0) {
            int rem = num % 10;
            revNo = revNo * 10 + rem;
            num = num / 10;
        }
        if (originalNo == revNo) {
            System.out.println("pallindrome");
        } else {
            System.out.println("not pallindrome");
        }
    }
}
