package com.array.medium;

import java.util.HashMap;
import java.util.Map;

public class App3_MajorityElementThatOccursMoreThanNBy2Times {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int n = 3;
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > n / 2) {
                System.out.println(entry.getKey());
            }
        }
    }
}
