package com.array.basic;

import java.util.HashMap;
import java.util.Map;

public class App7_NumberThatAppearsOnce {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i : arr) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
