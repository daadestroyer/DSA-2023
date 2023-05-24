package com.slidingwindow_twopointer;

import java.util.HashMap;
import java.util.Map;

public class App4_LongestRepeatingCharacterReplacement {
    public static int characterReplacement(String s, int k) {
        int left = 0, maxWin = 0, maxRC = 0, currWS = 0;
        int n = s.length();
        Map<Character, Integer> hm = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            maxRC = Math.max(maxRC, hm.get(ch));
            currWS = right - left + 1;

            if (currWS - maxRC > k) {
                char charToRemove = s.charAt(left);
                hm.put(charToRemove, hm.get(charToRemove) - 1);
                left++;
                currWS = right - left + 1;
            }
            maxWin = Math.max(maxWin, currWS);
        }
        return maxWin;
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAA", 0));
        System.out.println(characterReplacement("AABABBA", 1));
        System.out.println(characterReplacement("ABAB", 2));
        System.out.println(characterReplacement("ABBB", 2)); // 4
    }
}
