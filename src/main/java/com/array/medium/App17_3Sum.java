package com.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// three sum whose triplets give zero
public class App17_3Sum {

    public static List<List<Integer>> bruteForceApproach(int[] a) {
        Arrays.sort(a);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < a.length - 2; i++) {
            for (int j = i + 1; j < a.length - 1; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        List<Integer> temp = Arrays.asList(a[i], a[j], a[k]);

                        if (!res.contains(temp)) {
                            res.add(temp);
                        }
                    }
                }
            }
        }

        return res;
    }

    public static List<List<Integer>> optimizedApproach(int[] a) {
        Arrays.sort(a); // -4 -1 -1 0 1 2
        List<List<Integer>> al = new ArrayList<>();
        for (int lo = 0; lo < a.length - 2; lo++) {
            int mid = lo + 1;
            int hi = a.length - 1;
            int target = 0 - a[lo];

            while (mid < hi) {
                if (a[mid] + a[hi] == target) {
                    al.add(Arrays.asList(a[lo], a[mid], a[hi]));
                    while(mid < hi && a[lo] == a[mid+1])
                        mid++;
                    while(mid < hi && a[hi] == a[hi-1])
                        hi--;

                    mid++;
                    hi--;
                } else if (a[mid] + a[hi] < target) {
                    mid++;
                } else {
                    hi--;
                }
            }
        }


        return al;
    }

    public static void main(String[] args) {
        int[] a = {-2,0,0,2,2};
        List<List<Integer>> res1 = bruteForceApproach(a);
//        System.out.println(res1);
        List<List<Integer>> res2 = optimizedApproach(a);
        System.out.println(res2);
    }
}
