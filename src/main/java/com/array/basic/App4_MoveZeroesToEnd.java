package com.array.basic;

import java.util.Arrays;

public class App4_MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 0, 1};

        int slow = 0;
        int fast = 0;

        while (slow < arr.length && fast < arr.length) {
            if (arr[fast] != 0) {
                int temp = arr[fast];
                arr[fast] = arr[slow];
                arr[slow] = temp;
                slow++;
            }
            fast++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
