package com.recursion.basic;

import java.util.Arrays;

public class App5_ReverseArray {
    static void reverseArray(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }

        int temp = arr[lo];
        arr[lo] = arr[hi];
        arr[hi] = temp;
        reverseArray(arr, lo + 1, hi - 1);

    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        reverseArray(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
