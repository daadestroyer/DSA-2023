package com.array.medium;

import java.util.Arrays;

public class App13_RotateArrayByKDigits {

    static void reverse(int[] nums , int lo , int hi){
        while(lo <= hi){
            int temp = nums[lo];
            nums[lo] = nums[hi];
            nums[hi] = temp;
            lo++;
            hi--;
        }
    }
    public static void rotate(int[] nums, int k) {
        // reverse full array
        // 7 6 5 4 3 2 1
        reverse(nums,0,nums.length-1);

        // reverse k elements from start
        // 5 6 7 4 3 2 1
        reverse(nums,0,k-1);

        // reverse all elements from k+1 index
        // 5 6 7 1 2 3 4
        reverse(nums,k,nums.length-1);



    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        int k = 3;
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));

    }
}
