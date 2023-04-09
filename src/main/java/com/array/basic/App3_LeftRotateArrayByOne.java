package com.array.basic;

import java.util.Arrays;

public class App3_LeftRotateArrayByOne {

    static void reverseArray(int[] arr, int lo, int hi) {
        while (lo <= hi) {
            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
            lo++;
            hi--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int d = 3;

        reverseArray(arr, 0, d - 1);
        reverseArray(arr,d,arr.length-1);
        reverseArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
