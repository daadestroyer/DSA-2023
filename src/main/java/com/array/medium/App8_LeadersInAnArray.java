package com.array.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App8_LeadersInAnArray {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {10, 22, 12, 3, 0, 6};
        List<Integer> res = printLeaderInArray(arr);
        Collections.reverse(res);
        System.out.println(res);

    }

    private static List<Integer> printLeaderInArray(int[] arr) {
        List<Integer> res = new ArrayList<>();
        int currentBiggest = arr[arr.length - 1];

        res.add(currentBiggest);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > currentBiggest) {
                currentBiggest = arr[i];
                res.add(currentBiggest);
            }
        }
        return res;
    }
}
