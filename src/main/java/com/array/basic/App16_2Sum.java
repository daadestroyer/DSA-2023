package com.array.basic;

import java.util.*;

public class App16_2Sum {
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int n = 5;
        int target = 14;
        List<int[]> lst = new ArrayList<>();
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(target - arr[i])) {
                lst.add(new int[]{hm.get(target - arr[i]), i});

            }
            hm.put(arr[i], i);
        }
//        lst.stream().mapToInt(i->i).toArray()
        System.out.println(Arrays.toString(lst.get(0)));
    }
}
