package com.recursion.basic;

public class App9_getLastIndexOfANumberInArray {

    static int getLastIndex(int[] arr, int idx, int ele) {
        if (idx == arr.length - 1) {
            return -1;
        }

        int lastIdx = getLastIndex(arr, idx + 1, ele);
        if (lastIdx == -1) {
            if (arr[idx] == ele) {
                return idx;
            } else {
                return -1;
            }
        } else {
            return idx;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 4, 5, 6};
        System.out.println(getLastIndex(arr, 0, 2));
    }
}

