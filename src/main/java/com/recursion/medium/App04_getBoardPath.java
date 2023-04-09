package com.recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class App04_getBoardPath {
    static List<String> getBoardPath(int start, int end) {
        if (start == end) {
            List<String> bc = new ArrayList<>();
            bc.add("");
            return bc;
        }
        if (start > end) {
            List<String> bc = new ArrayList<>();
            return bc;
        }
        List<String> res = new ArrayList<>();
        for (int dice = 1; dice <= 6; dice++) {
            List<String> rec_res = getBoardPath(start + dice, end);

            for (String s : rec_res) {
                res.add(dice+s);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getBoardPath(0, 10));
    }
}
