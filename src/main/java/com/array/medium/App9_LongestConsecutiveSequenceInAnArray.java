package com.array.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class App9_LongestConsecutiveSequenceInAnArray {
    public static void main(String[] args) {
        int[] arr = {100, 200, 1, 3, 2, 4};

        Set<Integer> st = new HashSet<>();
        for (int i : arr) {
            st.add(i);
        }
        int longestSeq = 0;

        for (int i : arr) {
            if (!st.contains(i - 1)) {
                int startNum = i;
                int currentSeq = 1;

                while (st.contains(startNum + 1)) {
                    currentSeq = currentSeq + 1;
                    startNum = startNum + 1;
                }
                longestSeq = Math.max(longestSeq, currentSeq);
            }
        }
        System.out.println(longestSeq);

    }
}
