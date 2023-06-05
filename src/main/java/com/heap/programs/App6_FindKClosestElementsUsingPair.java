package com.heap.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;


public class App6_FindKClosestElementsUsingPair {

    static class Pair implements Comparable<Pair> {
        int gap;
        int val;

        Pair(int gap, int val) {
            this.gap = gap;
            this.val = val;
        }


        @Override
        public String toString() {
            return "Pair{" +
                    "gap=" + gap +
                    ", val=" + val +
                    '}';
        }


        @Override
        public int compareTo(Pair o) {
            if (this.gap == o.gap) {
                return this.val - o.val;
            } else {
                return this.gap - o.gap;
            }
        }
    }

    static ArrayList<Integer> findClosest(int[] arr, int x, int k) {
        ArrayList<Integer> al = new ArrayList<>();
//        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());

        // here we have created max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->Math.abs(a-x) < Math.abs(b-x) ? 1 : -1);

        for (int i : arr) {
            pq.add(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        while (!pq.isEmpty()) {
            al.add(pq.poll());
        }
        Collections.sort(al);
        return al;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 3;
        int k = 4;

//        int[] arr = {1,1,1,10,10,10};
//        int x = 9;
//        int k = 1;
        ArrayList<Integer> closest = findClosest(arr, x, k);
        System.out.println(closest);
    }
}
