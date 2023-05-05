package com.stack;

import java.util.ArrayList;
import java.util.List;

public class App2_SubOfSubArrayMinimum {
    public static void generateSubArray(int[] arr, int left, int right, List<List<Integer>> res) {

        if (left == arr.length) {
            return;
        }
        if (right == arr.length) {
            generateSubArray(arr, left + 1, left + 1, res);
        } else {
            List<Integer> curr_res = new ArrayList<>();
            for (int i = left; i <= right; i++) {
                curr_res.add(arr[i]);
            }
            res.add(curr_res);
            generateSubArray(arr, left, right + 1, res);
        }

    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        List<List<Integer>> res = new ArrayList<>();
        generateSubArray(arr, 0, 0, res);
        System.out.println(res);
    }
}
