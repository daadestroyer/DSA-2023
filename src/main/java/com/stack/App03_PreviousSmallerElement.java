package com.stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class App03_PreviousSmallerElement {
    public static void main(String[] args) {
        int[] a = {4, 5, 2, 10, 8};
        Map<Integer, Integer> hm = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        // create increasing monotonic stack
        for (int i = a.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && a[i] < st.peek()) {
                hm.put(st.pop(),a[i]);
            }
            st.push(a[i]);
        }
        // current hashmap
        // hm[10:2 , 8:2 , 5:4]
        for(int i=0 ; i<a.length ; i++){
            a[i] = hm.getOrDefault(a[i],-1);
        }
        System.out.println(Arrays.toString(a));
    }
}
