package com.twopointer;

import java.util.*;

public class App1_LongestSubstringWithoutRepeatingCharacters {

    static int bruteForce(String s) {
        int len = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (checkRepetition(s, i, j)) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }

    static boolean checkRepetition(String s, int i, int j) {
        Set<Character> st = new HashSet<>();
        for (int start = i; start <= j; start++) {
            if (st.contains(s.charAt(start))) {
                return false;
            }
            st.add(s.charAt(start));
        }
        return true;
    }

    static int slidingWindow(String s) {
        int len = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        int left = 0;
        int right = 0;
        int n = s.length();
        while (right < n) {
            if (hm.containsKey(s.charAt(right))) {
                left = Math.max(left, hm.get(s.charAt(right)) + 1);
            }

            hm.put(s.charAt(right), right);
            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";

        // System.out.println(bruteForce(s));

//        System.out.println(slidingWindow(s));



    }
}
