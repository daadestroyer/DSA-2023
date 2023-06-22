package com.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class App1_LongestSubstringWithoutRepeating {

    public static int bruteForceSolution(String s) {
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (checkRepetitions(s, i, j)) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }

    private static boolean checkRepetitions(String s, int i, int j) {
        Set<Character> st = new HashSet<>();
        for (int start = i; start <= j; start++) {
            if (st.contains(s.charAt(start))) {
                return false;
            } else {
                st.add(s.charAt(start));
            }
        }
        return true;
    }

    public static int optimalSolution(String s) {
        int n = s.length();
        Map<Character, Integer> hm = new HashMap<>();
        int maxL = 0;
        int left = 0;
        int right = 0;

        while (right < n) {
            if (hm.containsKey(s.charAt(right))) {
                left = Math.max(left, hm.get(s.charAt(right))+1);

            }
            hm.put(s.charAt(right), right);
            maxL = Math.max(maxL, right - left + 1);
            right++;
        }
        return maxL;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
//        int res1 = bruteForceSolution(s);
        int res2 = optimalSolution(s);
        System.out.println(res2);
    }
}
