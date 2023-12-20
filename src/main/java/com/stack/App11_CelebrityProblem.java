package com.stack;

import java.util.*;

public class App11_CelebrityProblem {

    static int findCelebrity(int[][] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            st.push(i);
        }

        while (st.size() >= 2) {
            int i = st.pop();
            int j = st.pop();

            if (arr[i][j] == 1) {
                // if i knows j -> i is not celebrity
                st.push(j);
            } else {
                // if i dont know j means i is celebrity
                st.push(i);
            }
        }
        int pot = st.pop();
        for (int i = 0; i < arr.length; i++) {
            if (i != pot) {
                if (arr[i][pot] == 0 || arr[pot][i] == 1) {
                    return -1;
                }
            }
        }
        return pot;
    }

    public static int findCelebrity1(int[][] arr) {
        Stack<Integer> st = new Stack<>();
        int celebrity = 0;
        for (int i = 0; i < arr.length; i++) {
            st.push(i);
        }

        while (st.size() >= 2) {
            int i = st.pop();
            int j = st.pop();

            if (arr[i][j] == 1) {
                st.push(j);
            } else {
                st.push(i);
            }
        }
        celebrity = st.pop();
        for (int i = 0; i < arr.length; i++) {
            if (i != celebrity) {
                if (arr[i][celebrity] == 0 && arr[celebrity][i] == 1) {
                    return -1;
                }
            }
        }
        return celebrity;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {0, 1, 1, 0},
                {1, 0, 1, 0},
                {0, 0, 0, 0},
                {1, 1, 1, 0}
        };
        System.out.println(findCelebrity1(arr));

    }
}
