package com.slidingwindow_twopointer;

/*
Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.


LOGIC--> basically we need to find the longest sub array with atmost 'k' zeroes
 */
public class App2_maxConsucutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;

        int left = 0, right = 0, len = 0, noOfZeroes = 0;
        while (right < arr.length) {
            if (arr[right] == 0) {
                noOfZeroes++;
            }
            if (noOfZeroes <= k) {
                len = Math.max(len, right - left + 1);
            }

            if (noOfZeroes > k) {
                if (arr[left] == 0) {
                    noOfZeroes--;
                }
                left++;
            }
            right++;
        }

        System.out.println(len);
    }
}
