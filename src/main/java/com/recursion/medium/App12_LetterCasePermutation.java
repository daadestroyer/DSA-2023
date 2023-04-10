package com.recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class App12_LetterCasePermutation {

    static void letterCase(char[] ques, List<String> res, int idx) {
        if (idx == ques.length) {
            res.add(new String(ques));
            return;
        }

        if (Character.isLetter(ques[idx])) {
            ques[idx] = Character.toUpperCase(ques[idx]);
            letterCase(ques, res, idx + 1);
            ques[idx] = Character.toLowerCase(ques[idx]);
            letterCase(ques, res, idx + 1);
        } else {
            letterCase(ques, res, idx + 1);
        }

    }

    public static void main(String[] args) {
        List<String> res = new ArrayList<>();
        letterCase("a1b2".toCharArray(), res, 0);
        System.out.println(res);
    }
}
