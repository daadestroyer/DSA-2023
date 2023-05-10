package com.stack;

import java.util.*;

public class App4_SlidingWindowMaximum {
    public static int[] bruteForce(int[] nums, int k) {
        int lo = 0;
        int hi = k-1;
        int n = nums.length;
        List<Integer> lst = new ArrayList<>();
        while(hi < n){
            int max = Integer.MIN_VALUE;
            for(int j=lo ; j<= hi ; j++){
                max = Math.max(max,nums[j]);
            }
            lst.add(max);
            lo++;
            hi++;
        }
        int[] res = lst.stream().mapToInt(i->i).toArray();
        return res;
    }

    public static int[] usingStack(int[] nums,int k){
        int n = nums.length;
        List<Integer> lst = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i=0 ; i<n ; i++){
            // removing numbers which are out of range k
            if(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }

            // removing numbers which are less than upcoming numbers
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]){
                dq.pollLast();
            }

            dq.addLast(i);

            // if window is changed then push previous window greater element
            if(i >= k-1){
                lst.add(nums[dq.peekFirst()]);
            }
        }
        return lst.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(bruteForce(new int[]{1,3,-1,-3,5,3,6,7},3)));
//        System.out.println(Arrays.toString(bruteForce(new int[]{1},1)));
//        System.out.println(Arrays.toString(bruteForce(new int[]{1-1},1)));

        System.out.println(Arrays.toString(usingStack(new int[]{1,3,-1,-3,5,3,6,7},3)));
     //   System.out.println(Arrays.toString(usingStack(new int[]{1},1)));
       // System.out.println(Arrays.toString(usingStack(new int[]{1-1},1)));


    }
}
