package com.array.medium;

public class App4_MaximumSubArraySumInArray {
    static int approach1(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                res = Math.max(res, sum);
            }
        }
        return res;
    }

    static int approach2(int[] arr) {
        int overAllSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i : arr) {
            currentSum += i;
            if (currentSum > overAllSum) {
                overAllSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return overAllSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        //System.out.println(approach1(arr));
        //System.out.println(approach2(arr));

        int csum = 0;
        int osum = Integer.MIN_VALUE;
        int start = 0;
        int endIdx = -1;
        int startIdx = -1;


        for (int i = 0; i < arr.length; i++) {
            if (csum == 0) start = i;

            csum += i;
            if (csum > osum) {
                osum = csum;
                startIdx = start;
                endIdx = i;
            }
            if (csum < 0) {
                csum = 0;

            }
        }
        System.out.println(startIdx + ":" + endIdx);
        for (int i = startIdx; i <= endIdx; i++) {
            System.out.print(arr[i] + ",");
        }
        //  System.out.println(osum);
    }
}
