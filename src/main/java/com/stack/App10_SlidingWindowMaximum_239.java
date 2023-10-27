package com.stack;

import java.util.*;

public class App10_SlidingWindowMaximum_239 {

    // this approach will give TLE for some cases
    static int[] bruteForce(int[] nums, int k) {
        List<Integer> al = new ArrayList<>();
        int n = nums.length;
        int lo = 0;
        int hi = k - 1;

        while (hi < n) {
            int max = Integer.MIN_VALUE;
            for (int j = lo; j <= hi; j++) {
                max = Math.max(max, nums[j]);
            }
            al.add(max);
            lo++;
            hi++;
        }
        return al.stream().mapToInt(i -> i).toArray();
    }

    static int[] optimalApproach(int[] nums, int k) {
        int n = nums.length;
        List<Integer> al = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // remove number which are outside window
            while (!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.removeFirst();
            }
            // from 2nd iteration just check if dq.last element is less than current num then
            // remove dq.last element and add current no in dq
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.removeLast();
            }
            // first time add the numbers simple at last of dq
            dq.addLast(i);
            // [3(1), -1(2), -3(3)]

            // if window is change add the previous window element in list
            if (i >= k - 1) {
                al.add(nums[dq.peekFirst()]);
            }


        }
        return al.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
//        System.out.println(Arrays.toString(bruteForce(nums, k)));
        System.out.println(Arrays.toString(optimalApproach(nums, k)));

    }
}
