package com.array.basic;

public class App9_reverseANumber {
    public static void main(String[] args) {
        int no = 1234;
        int temp = 0;
        while (no != 0) {
            int rem = no % 10;
            temp = temp * 10 + rem;
            no = no / 10;
        }
        System.out.println(temp);
    }
}
