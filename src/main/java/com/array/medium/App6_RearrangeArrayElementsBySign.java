package com.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App6_RearrangeArrayElementsBySign {

    public static int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        int k = 0;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int i : nums) {
            if (i < 0) {
                neg.add(i);
            } else {
                pos.add(i);
            }
        }
        int p = 0;
        int r = 0;
        while (p < pos.size() && r < neg.size()) {
            res[k++] = pos.get(p++);
            res[k++] = neg.get(r++);
        }
        return res;
    }

    static int[] optimalAppr(int[] nums) {
        int[] res = new int[nums.length];
        int posPtr = 0;
        int negPtr = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res[posPtr] = nums[i];
                posPtr = posPtr + 2;
            } else {
                res[negPtr] = nums[i];
                negPtr = negPtr + 2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 1};
        int[] res1 = rearrangeArray(nums);
       // System.out.println(Arrays.toString(res1));
        int[] res2 = optimalAppr(nums);
        System.out.println(Arrays.toString(res2));
    }
}
