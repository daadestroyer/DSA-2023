package com.slidingwindow_twopointer;

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

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1};
        int goal = 2;

//        int[] arr = {0, 0, 0, 0, 0};
//        int goal = 0;

        int ans = findSum(arr, goal) - findSum(arr,goal-1);
        System.out.println(ans);
    }
}
