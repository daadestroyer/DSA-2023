package com.recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class App05_getMazePath {
    static List<String> getMazePath(int cr, int cc, int er, int ec) {
        if (cr == er && cc == ec) {
            List<String> bc = new ArrayList<>();
            bc.add("");
            return bc;
        }

        if (cr > er || cc > ec) {
            List<String> bc = new ArrayList<>();
            return bc;
        }

        List<String> res = new ArrayList<>();

        List<String> rec_hor_res = getMazePath(cr, cc + 1, er, ec);
        for (String s : rec_hor_res) {
            res.add(s + "H");
        }
        List<String> rec_ver_res = getMazePath(cr + 1, cc, er, ec);
        for (String s : rec_ver_res) {
            res.add(s + "V");
        }

        List<String> rec_dia_res = getMazePath(cr + 1, cc+1, er, ec);
        for (String s : rec_ver_res) {
            res.add(s + "D");
        }
        return res;
    }

    public static void main(String[] args) {
        List<String> res = getMazePath(0, 0, 2, 2);
        System.out.println(res);
    }
}
