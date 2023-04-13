package com.math;

public class PallindromeOfNum {
    public static void main(String[] args) {
        int num = 121;
        int originalNum = num;
        int revNo = 0;

        while (num != 0) {
            int rem = num % 10;
            revNo = revNo * 10 + rem;
            num = num / 10;
        }
        if (originalNum == revNo) {
            System.out.println("number is pallindrome");
        } else {
            System.out.println("no is pallindrome");
        }
    }
}
