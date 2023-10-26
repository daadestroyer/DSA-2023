package com.stack;

import java.util.Arrays;
import java.util.Stack;

public class App06_AsteroidCollision {

    public static int[] asteroidCollision(int[] A) {
        Stack<Integer> st = new Stack<>();
        int n = A.length;
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() > 0 && A[i] < 0) {
                int sumOfCollision = st.peek() + A[i];
                if (sumOfCollision < 0) {
                    st.pop();
                } else if (sumOfCollision > 0) {
                    A[i] = 0;
                } else {
                    st.pop();
                    A[i] = 0;
                }
            }
            if (A[i] != 0)
                st.push(A[i]);
        }
        int[] res = new int[st.size()];
        for(int i=0 ; i<res.length ; i++){
            res[i] = st.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] asterois = {5, 10, -5};
        System.out.println(Arrays.toString(asteroidCollision(asterois)));
    }
}
