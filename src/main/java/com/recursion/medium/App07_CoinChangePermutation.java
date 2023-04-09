package com.recursion.medium;

public class App07_CoinChangePermutation {
    static void coinChangePerm(int[] arr, int total, String ans) {
        if(total == 0){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (total > 0)
                coinChangePerm(arr, total - arr[i], ans + arr[i]);
        }
    }

    public static void main(String[] args) {
        coinChangePerm(new int[]{2, 3, 5, 6}, 10, "");
    }
}
