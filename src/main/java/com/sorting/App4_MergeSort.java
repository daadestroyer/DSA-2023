package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class App4_MergeSort {


    static int[] merge(int[] fh, int[] sh) {
        int[] resarr = new int[fh.length + sh.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < fh.length && j < sh.length) {
            if (fh[i] < sh[j]) {
                resarr[k++] = fh[i++];
            } else {
                resarr[k++] = sh[j++];
            }
        }
        if (i == fh.length) {
            while (j < sh.length) {
                resarr[k++] = sh[j++];
            }
        }
        if (j == sh.length) {
            while (i < fh.length) {
                resarr[k++] = fh[i++];
            }
        }
        return resarr;
    }

    static int[] divideArray(int[] arr, int lo, int hi) {
        if (lo == hi) {
            int[] bc = new int[1];
            bc[0] = arr[lo];
            return bc;
        }
        int mid = (lo + hi) / 2;
        int[] fh = divideArray(arr, lo, mid);
        int[] sh = divideArray(arr, mid + 1, hi);
        int[] merge = merge(fh, sh);
        return merge;
    }

    public static void main(String[] args) {
        int arr[] = {9, 4, 7, 6, 3, 1, 5};
        int[] ints = divideArray(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(ints));
    }
}
