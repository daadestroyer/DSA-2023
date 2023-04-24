package com.recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class App14_GenerateSubArray {
    static int sum = 0;

    static void generateSubArray(int[] arr, int left, int right, List<List<Integer>> res) {
        if (left == arr.length) {
            for (List<Integer> sres : res) {
                sum += sres.stream().min((i1, i2) -> i1.compareTo(i2)).get();
            }
            return;
        }

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

    public int sumSubarrayMins(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        generateSubArray(arr, 0, 0, res);
        return sum;
    }

    public static void main(String[] args) {
        int ans = new App14_GenerateSubArray().sumSubarrayMins(new int[]{11, 81, 94, 43, 3});
        System.out.println(ans);
    }
}
