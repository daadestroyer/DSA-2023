package com.stack;

public class App07_SumOfSubArrayRanges {

    public static long bruteForce(int[] A) {
        int n = A.length;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int min = A[i];
            int max = A[i];

            for (int j = i; j < n; j++) {
                max = Math.max(max, A[j]);
                min = Math.min(min, A[j]);
                ans += max - min;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {4, -2, -3, 4, 1};
        System.out.println(bruteForce(A));
    }
}
