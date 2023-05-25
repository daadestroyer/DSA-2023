package com.slidingwindow_twopointer;

import java.util.HashMap;
import java.util.Map;

public class App5_BinarySubarraysWithSum {
    static int findSum(int[] arr, int goal) {
        int num = 0;
        int left = 0;
        int right = 0;
        int n = arr.length;
        int count = 0;

        while (right < n) {
            count = count + arr[right];
            while (left <= right && count > goal) {
                count = count - arr[left];
                left++;
            }
            num = num + (right - left);
            right++;
        }
        return num;
    }

    static int solution2(int[] arr, int goal) {
        Map<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int count = 0;
        hm.put(0,1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            count += hm.getOrDefault(sum - goal, 0);
            System.out.println(count);
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        System.out.println(hm);
        return count;


    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1};
        int goal = 2;

//        int[] arr = {0, 0, 0, 0, 0};
//        int goal = 0;

//        int ans = findSum(arr, goal) - findSum(arr, goal - 1);
//        System.out.println(ans);

        int ans1 = solution2(arr, goal);
        System.out.println(ans1);
    }
}
