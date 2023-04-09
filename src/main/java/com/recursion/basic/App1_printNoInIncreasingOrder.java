package com.recursion.basic;

public class App1_printNoInIncreasingOrder {
    static void printNo(int n) {
        if (n == 0) {
            return;
        }
//        printNo(n-1); // to print in increasing order
        System.out.println(n);
        printNo(n - 1);// to print in decreasing order


    }

    public static void main(String[] args) {
        printNo(5);
    }
}
