package com.heap.programs;

import java.util.PriorityQueue;

public class App3_MergeKSortedArrays {
    public static void main(String[] args) {
//        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int arr[][] = {{1,2,3,4},{2,2,3,4},
                {5,5,6,6},{7,8,9,9}};
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->a-b);

        for(int[] ar : arr){
            for(int i : ar){
                pq.add(i);
            }
        }
        System.out.println(pq);
    }
}
