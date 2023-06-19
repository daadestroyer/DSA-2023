package com.array.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class App15_MergeIntervals {

    public static int[][] merge(int[][] intervals) {

        return null;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        ArrayList<int[]> al = new ArrayList<int[]>();
        int start = a[0][0]; //1
        int end = a[0][1];  // 6

        for (int[] i : a) {
            if (i[0] <= end) {
                end = Math.max(end, i[1]);
            } else {
                al.add(new int[]{start, end});
                start = i[0];

                end = i[1];
            }
        }
        al.add(new int[]{start, end});
        int[][] ans = al.toArray(new int[0][]);

        for (int[] r : ans) {
            System.out.println(Arrays.toString(r));
        }

    }
}
