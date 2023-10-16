package com.stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class App04_PreviousGreaterElement {
    public static void main(String[] args) {
        int[] A = {7, 2, 1, 6, 9, 5, 4};
        // OP:   A = {-1,7,2,7,-1,9,5}
        int n = A.length;
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && A[i] > st.peek()) {
                hm.put(st.pop(), A[i]);
            }
            st.push(A[i]);
        }
        for(int i=0 ; i<n ; i++){
            A[i] = hm.getOrDefault(A[i],-1);
        }
        System.out.println(Arrays.toString(A));
    }
}
