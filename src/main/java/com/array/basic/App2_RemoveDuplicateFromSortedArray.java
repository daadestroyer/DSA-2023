package com.array.basic;

import java.util.Arrays;

public class App2_RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3};

        int i = 0;

        for (int j = 1; j < arr.length - 1; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];

            }
        }
        System.out.println(i + 1+":::"+ Arrays.toString(arr));
    }
}
