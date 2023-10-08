package com.stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]

Input: nums1 = [2,4], nums2 = [1,2,3,4]
Output: [3,-1]
*/
public class App01_NextGreaterElement_1 {

    // TC: O(N^) , SC:O(1)
    static int[] approach1(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            int max = -1;
            boolean flag = false;

            for (int j = 0; j < nums2.length; j++) {
                // find the matching point
                if (nums1[i] == nums2[j]) {
                    flag = true;
                }
                // got the matching point
                if (flag) {
                    if (nums2[j] > nums1[i]) {
                        max = nums2[j];
                        break; // break it because we just need next greater not further
                    }
                }
            }
            nums1[i] = max;
        }

        return nums1;
    }

    static int[] monotonicStack(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            while (!st.isEmpty() && nums2[i] > st.peek()) {
                hm.put(st.pop(), nums2[i]);
            }
            st.push(nums2[i]);
        }
//        int i=0;
//        for(int no : nums1){
//            nums1[i++] = hm.getOrDefault(no , -1);
//        }

        for(int i=0 ; i<nums1.length;i++){
            nums1[i] = hm.getOrDefault(nums1[i],-1);

        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        // System.out.println(Arrays.toString(approach1(nums1,nums2)));
        System.out.println(Arrays.toString(monotonicStack(nums1, nums2)));
    }
}
