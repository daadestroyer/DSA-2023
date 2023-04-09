package com.array.hard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class App5_FindTheRepeatingAndMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 8, 4, 6, 7, 8};
        int repeated = 0;
        int missing = 0;
        Arrays.sort(arr);
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 1; i <= arr.length; i++) {
            if (hm.containsKey(i)) {
                if (hm.get(i) > 1) {
                    repeated = i;
                }
            } else {
                missing = i;
            }
        }
        System.out.println(hm);
        System.out.println(repeated + ":" + missing);
    }
}
