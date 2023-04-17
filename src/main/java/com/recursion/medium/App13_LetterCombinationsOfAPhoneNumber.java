package com.recursion.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App13_LetterCombinationsOfAPhoneNumber {
    static List<String> mapping = Arrays.asList("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz");

    static void generate(List<String> ans, String letter, String digits, int idx) {
        if (letter.length() == digits.length()) {
            ans.add(letter);
            return;
        }

        String currDigit = mapping.get(Character.getNumericValue(digits.charAt(idx)));
        for (int i = 0; i < currDigit.length(); i++) {
            generate(ans, letter + currDigit.charAt(i), digits, idx + 1);
        }
    }

    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        String digits = "23";
        generate(ans, "", digits, 0);
        System.out.println(ans);
    }
}
