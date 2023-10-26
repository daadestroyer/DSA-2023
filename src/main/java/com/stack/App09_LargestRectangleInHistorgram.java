package com.stack;

import java.util.Arrays;
import java.util.Stack;

public class App09_LargestRectangleInHistorgram {
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxA = 0;
        Stack<Integer> st = new Stack<>();
        // creating left smallest
        int[] leftSmallest = new int[n];
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                leftSmallest[i] = 0;
            } else {
                leftSmallest[i] = st.peek() + 1;
            }
            st.push(i);
        }
        // clearing the stack
        while(!st.isEmpty()) st.pop();
        // creating right smallest
        int[] rightSmallest = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                rightSmallest[i] = n - 1;
            } else {
                rightSmallest[i] = st.peek() - 1;
            }
            st.push(i);
        }
        for(int i=0 ; i<n ; i++){
            maxA = Math.max(maxA,(rightSmallest[i] - leftSmallest[i] + 1) * heights[i]);
        }
        return maxA;
    }

    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(heights));
    }
}
