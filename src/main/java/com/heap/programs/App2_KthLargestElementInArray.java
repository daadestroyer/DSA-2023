package com.heap.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class App2_KthLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        List<Integer> res = new ArrayList<>();
        int k = 2;
//        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
//
//        for (int i : arr) {
//            minHeap.add(i);
//            if (minHeap.size() > k) {
//                minHeap.poll();
//            }
//        }
//
//        System.out.println(minHeap.peek());
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        for(int i : arr){
            minheap.add(i);
            if(minheap.size() > k){
                minheap.poll();
            }
        }
        while(!minheap.isEmpty()){
            res.add(minheap.poll());
        }

        System.out.println(res);
    }
}
