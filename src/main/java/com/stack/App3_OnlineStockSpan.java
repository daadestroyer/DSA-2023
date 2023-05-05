package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class App3_OnlineStockSpan {

    int idx = 0;

    class Pair {
        int data;
        int idx;

        public Pair(int data, int idx) {
            this.data = data;
            this.idx = idx;
        }
    }

    Stack<Pair> st;

    public App3_OnlineStockSpan() {
        st = new Stack<>();
    }

    public int next(int price) {
        if (st.isEmpty()) {
            st.push(new Pair(price, idx++));
            return 1;
        } else {
            int ans;
            while (st.size() != 0 && st.peek().data <= price) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans = idx + 1;
            } else {
                ans = idx - st.peek().idx;
            }
            st.push(new Pair(price, idx++));
            return ans;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        App3_OnlineStockSpan app = new App3_OnlineStockSpan();

        while (n-- > 0) {
            int price = sc.nextInt();
            System.out.println(app.next(price));
        }
    }
}
