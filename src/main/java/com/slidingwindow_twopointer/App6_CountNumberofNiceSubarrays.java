package com.slidingwindow_twopointer;

public class App6_CountNumberofNiceSubarrays {

    public static int numberOfSubarrays(int[] nums, int k) {
        int l = 0, r = 0, oddc = 0, count = 0, tempc = 0;
        int n = nums.length;

        while (r < n) {
            if (nums[r] % 2 != 0) {
                oddc++;
                tempc = 0;
            }
            while (oddc == k) {
                tempc++;
                if (nums[l] % 2 != 0) {
                    oddc--;
                }
                l++;
            }
            System.out.println(tempc);
            count += tempc;
//            System.out.println(count);
            r++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSubarrays(new int[]{1,1,2,1,1}, 3));
    }

}
