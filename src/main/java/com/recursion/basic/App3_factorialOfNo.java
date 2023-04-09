package com.recursion.basic;

public class App3_factorialOfNo {

    static int printFact(int n) {
        if (n == 1) {
            return 1;
        }

        return n * printFact(n - 1);
    }

    public static void main(String[] args) {
        int ans = printFact(5);
        System.out.println(ans);
    }
}
