package com.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App18_4Sum {

    static List<List<Integer>> bruteForce(int[] a, int target) {
        List<List<Integer>> al = new ArrayList<>();
        for (int i = 0; i < a.length - 3; i++) {
            for (int j = i + 1; j < a.length - 2; j++) {
                for (int k = j + 1; k < a.length - 1; k++) {
                    for (int l = k + 1; l < a.length; l++) {
                        if (a[i] + a[j] + a[k] + a[l] == target && !al.contains(Arrays.asList(a[i], a[j], a[k], a[l]))) {
                            al.add(Arrays.asList(a[i], a[j], a[k], a[l]));
                        }
                    }
                }
            }
        }
        return al;
    }

    public static void main(String[] args) {
        int[] a = {1, 0, -1, 0, -2, 2};
        List<List<Integer>> res1 = bruteForce(a, 0);
        System.out.println(res1);
    }
}
