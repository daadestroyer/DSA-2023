package com.array.hard;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App2_ThreeSum {

    static void bruteForce(int[] arr) {
        List<ArrayList<Integer>> lst = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        Collections.sort(temp);
                        if (!lst.contains(temp)) {
                            lst.add(temp);
                        }
                    }
                }
            }
        }
        System.out.println(lst);
    }

    static void optimalApproach(int[] arr) {
        Arrays.sort(arr);
        // -4, -1, -1, 0, 1, 2
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            if (i == 0 || (arr[i] != arr[i - 1])) {
                int lo = i + 1;
                int hi = n - 1;
                int target = 0 - arr[i];

                while (lo < hi) {
                    if (arr[lo] + arr[hi] == target) {
                        ans.add(Arrays.asList(arr[i], arr[lo], arr[hi]));
                        while (lo < hi && arr[lo] == arr[lo + 1])
                            lo++;
                        while (lo < hi && arr[hi] == arr[hi - 1])
                            hi--;
                        lo++;
                        hi--;
                    } else if (arr[lo] + arr[hi] < target) {
                        lo++;
                    } else {
                        hi--;
                    }
                }
            }
        }

        System.out.println(ans);

    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<Integer> list = new ArrayList<>();
        //bruteForce(arr);

        optimalApproach(arr);


    }
}
