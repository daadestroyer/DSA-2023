package com.heap.programs;

import java.util.PriorityQueue;

public class App2_KthLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i : arr) {
            minHeap.add(i);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        System.out.println(minHeap.peek());
    }
}
