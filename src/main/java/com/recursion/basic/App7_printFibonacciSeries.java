package com.recursion.basic;

public class App7_printFibonacciSeries {
    static int printFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return printFibonacci(n - 1) + printFibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(printFibonacci(5));
        // 0 1 1 2 3 5
    }
}
