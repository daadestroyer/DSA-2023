package com.array.hard;

import java.util.Arrays;

public class App4_MergeSortedArray {

    public static void sortArray(int[] arr1, int[] arr2, int m, int n) {
        int k = arr1.length - 1;
        int left = m - 1;
        int right = n - 1;

        while (left >= 0 && right >= 0) {
            if (arr2[right] > arr1[left]) {
                arr1[k] = arr2[right];
                k--;
                right--;
            } else {
                arr1[k] = arr1[left];
                k--;
                left--;
            }
        }
        while (right >= 0) {
            arr1[k--] = arr2[right--];

        }
    }

    public static void main(String[] args) {
        int arr1[] = {0};
        int arr2[] = {1};
        sortArray(arr1, arr2, 0, 1);

        System.out.println(Arrays.toString(arr1));


    }
}
