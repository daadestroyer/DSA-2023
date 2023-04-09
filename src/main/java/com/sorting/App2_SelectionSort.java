package com.sorting;

import java.util.Arrays;

public class App2_SelectionSort {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};

        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
