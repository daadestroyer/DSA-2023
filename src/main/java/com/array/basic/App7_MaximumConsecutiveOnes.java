package com.array.basic;

public class App7_MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int count = 0;
        int finalCount = 0;

        for (int i : nums) {
            if (i == 1) {
                ++count;
                finalCount = Math.max(count, finalCount);
            } else {
                finalCount = Math.max(count, finalCount);
                count = 0;
            }
        }
    }
}
