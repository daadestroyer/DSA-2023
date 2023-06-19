package com.array.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App3_MajorityElementThatOccursMoreThanNBy2Times {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int n = nums.length;
        Map<Integer, Integer> hm = new HashMap<>();
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);

        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > n / 2) {
                al.add(entry.getValue());
            }
        }
        System.out.println(al);
    }
}
