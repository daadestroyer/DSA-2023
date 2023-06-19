package com.array.basic;

import java.util.Arrays;

public class App18_MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;

        int k = nums1.length - 1;
        int left = m - 1;
        int right = n - 1;

        while (left >= 0 && right >= 0) {
            if (nums2[right] > nums1[left]) {
                nums1[k--] = nums2[right--];
            } else {
                nums1[k--] = nums1[left--];
            }
        }
        while (right >= 0) {
            nums1[k--] = nums2[right--];
        }
        while (left >= 0) {
            nums1[k--] = nums1[left--];
        }
        System.out.println(Arrays.toString(nums1));
    }
}
