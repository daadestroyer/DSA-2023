package com.array.hard;

import java.util.*;
import java.util.stream.Collectors;

public class App1_MajorityElementII {
    static List<Integer> bruteForce(int[] arr) {
        List<Integer> lst = new ArrayList<>();
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > arr.length / 3) {
                lst.add(entry.getKey());
            }
        }
        return lst.size() == 0 ? Arrays.stream(arr).boxed().collect(Collectors.toList()) : lst;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(bruteForce(nums));
    }
}
