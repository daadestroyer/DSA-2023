package com.recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class App11_SubsetOfArray {

    static void subSetArray(int[] arr, List<List<Integer>> res, List<Integer> ds, int idx) {
        res.add(new ArrayList<>(ds));


        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1]) continue;

            ds.add(arr[idx]);
            subSetArray(arr, res, ds, idx + 1);
            ds.remove(ds.size() - 1);
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        subSetArray(arr, res, ds, 0);
        System.out.println(res);

//        List<Integer> res1 = new ArrayList<>();
//        res1.add(2);
//        res1.add(1);
//
//        List<Integer> res2 = new ArrayList<>();
//        res2.add(1);
//        res2.add(2);
//
//        System.out.println(res1.equals(res2));
    }
}
