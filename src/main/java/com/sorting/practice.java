package com.sorting;

public class practice {

    static int[] mergeToArray(int[] fh, int[] sh) {
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

    static int[] divideArray(int[] arr, int lo, int hi) {
        if (arr[lo] == arr[hi]) {
            int[] bc = new int[1];
            bc[0] = arr[lo];
            return bc;
        }

        int mid = (lo + hi) / 2;
        int[] fh = divideArray(arr, lo, mid);
        int[] sh = divideArray(arr, mid + 1, hi);
        int[] merge = mergeToArray(fh, sh);
        return merge;
    }

    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};

        divideArray(arr, 0, arr.length - 1);
    }
}
