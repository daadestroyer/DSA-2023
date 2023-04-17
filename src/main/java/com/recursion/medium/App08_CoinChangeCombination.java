package com.recursion.medium;

import java.util.ArrayList;

public class App08_CoinChangeCombination {
    static void coinChangeCombination(int[] coins, int total, String ans, int lastIdx) {
        if (total == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = lastIdx; i < coins.length; i++) {
            if (total > 0)
                coinChangeCombination(coins, total - coins[i], ans + coins[i], lastIdx);
        }
    }

    public static void main(String[] args) {

        coinChangeCombination(new int[]{10,1,2,7,6,1,5}, 8, "", 0);

    }
}
