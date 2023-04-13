package com.array;

import java.util.Arrays;

public class Test {
    static void bubbleSort(int[] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }

    static void selectionSort(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < A.length - 1; j++) {
                if (A[j] < A[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = A[i];
            A[i] = A[minIdx];
            A[minIdx] = temp;
        }
    }

    static int[] merge(int[] fh, int[] sh) {
        int[] res = new int[fh.length + sh.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < fh.length && j < sh.length) {
            if (fh[i] < sh[j]) {
                res[k++] = fh[i++];
            } else {
                res[k++] = sh[j++];
            }
        }

        if (i == fh.length) {
            while (j < sh.length) {
                res[k++] = sh[j++];
            }
        }
        if (j == sh.length) {
            while (i < fh.length) {
                res[k++] = fh[i++];
            }
        }
        return res;
    }

    static int[] mergeSort(int[] A, int low, int hi) {
        if (low >= hi) {
            int[] bc = new int[1];
            bc[0] = A[low];
            return bc;
        }
        int mid = (low + hi) / 2;
        int[] fh = mergeSort(A, low, mid);
        int[] sh = mergeSort(A, mid + 1, hi);
        return merge(fh, sh);
    }

    static void insertionSort(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int minIdx = i;
            while (minIdx > 0 && A[minIdx - 1] > A[minIdx]) {
                int temp = A[minIdx];
                A[minIdx] = A[minIdx - 1];
                A[minIdx - 1] = temp;
                minIdx--;
            }
        }
    }

    static void quickSort(int[] A, int low, int high) {
        if (low >= high) return;
        int piv = (low + high) / 2;
        int lo = low;
        int hi = high;
        while (lo <= hi) {
            while (A[lo] < A[piv]) {
                lo++;
            }
            while (A[hi] > A[piv]) {
                hi--;
            }

            if (lo <= hi) {
                int temp = A[lo];
                A[lo] = A[hi];
                A[hi] = temp;
                lo++;
                hi--;
            }
        }
        quickSort(A, low, hi);
        quickSort(A, lo, high);
    }

    public static void main(String[] args) {
        int A[] = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        //bubbleSort(A);
        // selectionSort(A);
        //int[] res = mergeSort(A, 0, A.length - 1);
        //insertionSort(A);
        quickSort(A, 0, A.length - 1);
        System.out.println(Arrays.toString(A));
    }
}
