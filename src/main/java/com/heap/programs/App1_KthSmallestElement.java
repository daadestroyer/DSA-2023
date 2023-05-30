package com.heap.programs;

import java.util.Comparator;
import java.util.PriorityQueue;

public class App1_KthSmallestElement {
    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 3, 20, 15};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int k = 3;
        for (int i : arr) {
            pq.add(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        System.out.println(pq.peek());
    }
}
