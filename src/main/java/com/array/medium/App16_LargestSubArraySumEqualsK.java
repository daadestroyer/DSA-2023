package com.array.medium;

import java.util.HashMap;
import java.util.Map;

public class App16_LargestSubArraySumEqualsK {

    private static int sum(int i, int j, int[] a, int k) {
        int sum = 0;
        for (int i1 = i; i1 <= j; i1++) {
            sum += a[i1];
        }
        if (sum == k) {
            return 1;
        }
        return -1;
    }

    public static int bruteForce(int[] nums, int k) {
        int res = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (sum(i, j, nums, k) == 1) {
                    res += 1;
                }
            }
        }
        return res;
    }

    public static int optimalApproach1(int[] nums, int k) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                if (sum(i, j, nums, k) == 1) {
                    sum += 1;
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static int bestApproach(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        int csum = 0;
        int res = 0;
        hm.put(0, 1);
        for (int i : nums) {
            csum += i;
            res += hm.getOrDefault(csum - k, 0);
            hm.put(csum, hm.getOrDefault(csum, 0) + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        // System.out.println(bruteForce(nums, k));
//        System.out.println(optimalApproach1(nums, k));

        System.out.println(bestApproach(nums, k));
    }
}
