package com.array.basic;

public class App15_FindMissingNumberInArray {

    public static int missingNumber(int[] nums) {
        int n = nums.length;

        int sum = n * (n + 1) / 2;
        int csum = 0;
        for (int i : nums) {
            csum += i;
        }
        return sum - csum;
    }

    public static void main(String[] args) {
        int[] a = { 0, 1};
        int ans = missingNumber(a);
        System.out.println(ans);

    }
}
