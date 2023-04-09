package com.recursion.basic;

public class App8_checkArrayIsSortedOrNot {

    static boolean checkArraySorted(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] > arr[idx + 1]) {
            return false;
        } else {
            return checkArraySorted(arr, idx + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(checkArraySorted(arr, 0));
    }
}
