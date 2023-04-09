package com.searching;

public class App2_BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50, 60, 70};
        int search = 40;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == search) {
                System.out.println("Element Found");
                break;
            } else if (arr[mid] < search) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}
