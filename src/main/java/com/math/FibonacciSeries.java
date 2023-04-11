package com.math;

public class FibonacciSeries {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13
        int n1 = 0;
        int n2 = 1;
        int count = 10;

        System.out.print(n1 + " " + n2);
        for (int i = 2; i <= count; i++) {
            int sum = n1 + n2;

            n1 = n2;
            n2 = sum;
            System.out.print(" "+sum);
        }
    }
}
