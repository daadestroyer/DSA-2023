package com.array.medium;

public class App5_StockBuyAndSell {

    static int bruteForce(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    res = Math.max(res, arr[j] - arr[i]);
                }
            }
        }
        return res;
    }

    static int optimalApproach(int[] arr) {
        int res = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            minPrice = Math.min(minPrice, arr[i]);
            res = Math.max(res, arr[i] - minPrice);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        // System.out.println(bruteForce(prices));
        System.out.println(optimalApproach(prices));
    }
}
