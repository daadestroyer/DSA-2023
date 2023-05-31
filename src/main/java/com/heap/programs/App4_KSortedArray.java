package com.heap.programs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class App4_KSortedArray {
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            // 2 3 5 6
            if (pq.size() > k) {
                al.add(pq.poll());
            }
        }

        while(!pq.isEmpty()){
            al.add(pq.poll());
        }


        System.out.println(al);
    }
}
