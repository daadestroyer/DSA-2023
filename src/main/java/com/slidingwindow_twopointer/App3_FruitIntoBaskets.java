package com.slidingwindow_twopointer;

import java.util.HashMap;
import java.util.Map;

public class App3_FruitIntoBaskets {
    public static void main(String[] args) {
        int[] fruits = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        Map<Integer, Integer> hm = new HashMap<>();

        int left = 0, right = 0;

        int res = 0;

        while (right < fruits.length) {
            hm.put(fruits[right], hm.getOrDefault(fruits[right], 0) + 1);
            while (hm.size() > 2) {
                hm.put(fruits[left], hm.get(fruits[left]) - 1);
                if (hm.get(fruits[left]) == 0) {
                    hm.remove(fruits[left]);
                }
                left++;
            }
            res = Math.max(res, right - left + 1);
            right++;
        }
        System.out.println(res);

    }
}
