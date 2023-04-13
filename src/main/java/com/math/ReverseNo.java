package com.math;

public class ReverseNo {
    public static void main(String[] args) {
        int num = 1234;
        int revNum = 0;

        while (num != 0) {
            int rem = num % 10;
            revNum = revNum * 10 + rem;
            num = num / 10;
        }
        System.out.println("reverse num is : " + revNum);
    }
}
