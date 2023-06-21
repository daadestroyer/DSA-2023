package com.array.medium;

import java.util.HashMap;
import java.util.Map;

public class App19_LargestSubArrayWithSumZero {

    static int bruteForceApp(int[] a) {
        int maxL = 0;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[i];
                if (sum == 0) {
                    maxL = Math.max(maxL, j - i + 1);
                }
            }
        }
        return maxL;
    }

    static int optimizedApp(int[] a) {
        // 15,-2,2,-8,1,7,10,23
        Map<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int maxL = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum == 0) {
                maxL = i + 1;
            }
            else{
                if (hm.containsKey(sum)) {
                    maxL = Math.max(maxL, i - hm.get(sum));
                } else {
                    hm.put(sum, i);
                }
            }
        }

        return maxL;
    }

    public static void main(String[] args) {
        int[] a = {15, -2, 2, -8, 1, 7, 10, 23};
        int[] a1 = {-1, 1, -1, 1};
//        int res1 = bruteForceApp(a);
//        System.out.println(res1);

        int res2 = optimizedApp(a1);
        System.out.println(res2);
    }
}
