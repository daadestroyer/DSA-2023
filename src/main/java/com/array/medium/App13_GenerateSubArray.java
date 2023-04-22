package com.array.medium;

import java.util.ArrayList;
import java.util.List;

public class App13_GenerateSubArray {
    static void generateSubArray(int[] arr, int left, int right, List<List<Integer>> res) {
        if (left == arr.length) return;

        if (right == arr.length) {
            generateSubArray(arr, left + 1, left + 1, res);
        } else {
            List<Integer> curr = new ArrayList<>();
            for (int i = left; i < right; i++) {
                curr.add(arr[i]);
            }
            curr.add(arr[right]);
            res.add(curr);
            generateSubArray(arr, left, right + 1, res);

        }
    }

    public static void main(String[] args) {
        List<List<Integer>> res = new ArrayList<>();
        generateSubArray(new int[]{3, 1, 2, 4}, 0, 0, res);

        System.out.println(res);
//        int sum = 0;
//        for (List<Integer> sres : res) {
//            sum += sres.stream().min((i1, i2) -> i1.compareTo(i2)).get();
//        }
//        // 3 31 321 3214
//        // 1 12 124
//        // 2 24
//        // 4
//        System.out.println(sum);
    }
}
