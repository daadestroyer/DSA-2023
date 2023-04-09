package com.recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class App3_getAllSubSeqOfString {
    static List<String> getSubSeq(String str) {
        if (str.length() == 0) {
            List<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        char cc = str.charAt(0);
        String ros = str.substring(1);
        List<String> rec_res = getSubSeq(ros);
        List<String> res = new ArrayList<>();

        for (String s : rec_res) {
            res.add(s);
            res.add(cc+s);
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "abc";
        List<String> res = getSubSeq(str);
        System.out.println(res);
    }
}
