package com.stack;

import java.util.*;
import java.util.stream.Collectors;

public class App5_CelebrityProblem {

    static int findCelebrity(int[][] arr){
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
        for(int i=0 ; i<arr.length ; i++){
            if(i != pot){
                if(arr[i][pot]==0 || arr[pot][i] == 1){
                    return -1;
                }
            }
        }
        return pot;
    }
    public static void main(String[] args) {

        int[][] arr = {
                {0, 1, 0},
                {0, 0, 0},
                {0, 1, 0}
        };

        System.out.println(findCelebrity(arr));

    }
}
