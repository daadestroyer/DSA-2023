package com.array.basic;

public class App8_LongestSubarrayWithGivenSumK {
    public static void main(String[] args) {
        int[] arr = {7, 1, 6, 0};
        int k = 7;

        int sum = 0;
        int maxLen = 0;
        int start = 0;
        int end = 0;
        while (start < arr.length) {
            while (end < arr.length && sum + arr[end] <= k) {
                sum += arr[end];
                end++;
            }

            if (sum == k) {
                System.out.println(end + ":" + start);
                maxLen = Math.max(maxLen, end - start);
            }

            // if sum > k
            sum = sum - arr[start];
            start++;

        }
        System.out.println(maxLen);

    }

}
