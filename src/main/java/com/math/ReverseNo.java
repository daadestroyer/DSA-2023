package com.math;

public class ReverseNo {
    public static void main(String[] args) {
        int num = 121;
        int originalNo = num;
        int revno = 0;

        while (num != 0) {
            int rem = num % 10;
            revno = revno * 10 + rem;
            num = num / 10;
        }
        System.out.println(originalNo == revno);
    }
}
