package com.array.hard;

import java.util.ArrayList;
import java.util.List;

public class App3_PascalsTriangle {

    static List<List<Integer>> pascalTriangle(int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr, pre = null;
        for (int i = 0; i < n; i++) {
            curr = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    curr.add(1);
                } else {
                    curr.add(pre.get(j - 1) + pre.get(j));
                }
            }
            res.add(curr);
            pre = curr;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(pascalTriangle(n));

    }
}
