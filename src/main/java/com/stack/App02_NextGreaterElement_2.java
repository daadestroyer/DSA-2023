package com.stack;

import java.util.*;

public class App02_NextGreaterElement_2 {

    public static int[] monotonicstack(int[] nums) {

        int len = nums.length;
        int[] output = new int[nums.length];

        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            al.add(nums[i]);
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            al.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            for(int j=1 ; j>al.size() ; j++){
                if(al.get(j) > nums[i]){
                    nums[i] = al.get(j);
                }
                else{
                    nums[i] = -1;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return output;
    }

    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(monotonicstack(nums)));
    }
}
