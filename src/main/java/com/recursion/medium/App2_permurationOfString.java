package com.recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class App2_permurationOfString {
    static List<String> findPerm(String str) {
        if (str.length() == 0) {
            List<String> res = new ArrayList<>();
            res.add("");
            return res;
        }

        char cc = str.charAt(0);
        String ros = str.substring(1);
        List<String> rec_rec = findPerm(ros);
        List<String> res = new ArrayList<>();
        for (String s : rec_rec) {
            for (int i = 0; i <= s.length(); i++) {
                String val = s.substring(0, i) + cc + s.substring(i);
                res.add(val);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "abc";
        List<String> res = findPerm(str);
        System.out.println(res);
    }
}
