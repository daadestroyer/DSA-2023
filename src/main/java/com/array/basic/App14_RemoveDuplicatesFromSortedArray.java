package com.array.basic;

import java.util.Arrays;

public class App14_RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int slow = 0;


        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow+1;
    }

    public static void main(String[] args) {
        int[] a = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int ans = removeDuplicates(a);
        System.out.println(Arrays.toString(a));
        System.out.println(ans);
    }
}
