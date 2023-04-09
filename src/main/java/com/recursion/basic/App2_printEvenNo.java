package com.recursion.basic;

public class App2_printEvenNo {
    static void printEvenNo(int n) {
        if(n == 0){
            return;
        }
        printEvenNo(n-1);
        if(n%2==0){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        printEvenNo(10);
    }
}
