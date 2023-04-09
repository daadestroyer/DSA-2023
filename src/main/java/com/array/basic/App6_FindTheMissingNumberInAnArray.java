package com.array.basic;

public class App6_FindTheMissingNumberInAnArray {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = {1, 3};

        int i = 0;
        int sum = 0;
        while (i++ < n) {
            sum += i;
        }
        int arrsum = 0;
        for (int j : arr) {
            arrsum += j;
        }
        System.out.println(sum - arrsum);
    }
}
