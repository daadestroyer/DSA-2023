package com.recursion.medium;

import com.recursion.basic.App5_ReverseArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App1_permutationOfArray {
    static void approach1(int[] arr, List<List<Integer>> ans, List<Integer> ds, boolean[] flag) {
        if (ds.size() == arr.length) {
            if (isValid(ds, ans)) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (flag[i] != true) {
                flag[i] = true;
                ds.add(arr[i]);
                approach1(arr, ans, ds, flag);
                flag[i] = false;
                ds.remove(ds.size() - 1);
            }
        }
    }

    static boolean isValid(List<Integer> ds, List<List<Integer>> res) {
        for (List<Integer> r : res) {

            if (r.equals(ds)) {
                return false;
            }
        }
        return true;
    }

    static void approach2(int index, int[] arr, List<List<Integer>> ans) {
        if (index == arr.length - 1) {
            List<Integer> ds = new ArrayList<>();
            for (int i : arr) {
                ds.add(i);
            }
            ans.add(ds);
            return;
        }
        for (int i = index; i < arr.length; i++) {
            swap(arr, i, index);
            approach2(index + 1, arr, ans);
            swap(arr, i, index);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] flag = new boolean[arr.length];
        approach1(arr, ans, ds, flag);
        // approach2(0, arr, ans);
        System.out.println(ans);




    }
}
