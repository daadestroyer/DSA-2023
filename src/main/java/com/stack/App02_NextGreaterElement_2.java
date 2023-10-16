package com.stack;

import java.util.*;

public class App02_NextGreaterElement_2 {

    public static int[] monotonicstack(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        for(int i=0 ; i<n ; i++){
            while(!st.isEmpty() && nums[i] > nums[st.peek()]){
                res[st.pop()] = nums[i];
            }
            st.push(i);
        }
        for(int i=0 ; i<n ; i++){
            while(!st.isEmpty() && nums[i] > nums[st.peek()]) {
                res[st.pop()] = nums[i];
            }

        }
        while(!st.isEmpty()){
            res[st.pop()] = -1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3};
//        System.out.println(Arrays.toString(monotonicstack(nums)));
        System.out.println(1>1);
    }


}
