package com.linkedlist.ImplementedLinkedList;

import java.util.*;

public class main {
    static boolean checkAnagram(char[] c1, char[] c2) {
        if (c1.length != c1.length) {
            return false;
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> digit = new ArrayList<>();
        digit.add("321");
        digit.add("123");
        System.out.println(digit);
        Collections.sort(digit);
        System.out.println(digit);
    }
}
