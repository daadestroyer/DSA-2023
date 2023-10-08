package com.heap.programs;

import java.util.*;

public class App7_TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->hm.get(a)-hm.get(b));
        for (int key : hm.keySet()) {
            pq.add(key);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        while (!pq.isEmpty()) {
            al.add(pq.poll());
        }

        return al.stream().sorted().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

//        int[] nums = {1, 1, 3, 3, 3, 3, 4, 4};
//        int k = 2;

//        int[] nums = {4, 1, -1, 2, -1, 2, 3};
//        int k = 2;

//        int[] nums = {1,1,1,3,2,2,4};
//        int k = 2;

        int[] a = topKFrequent(nums, k);
      System.out.println(Arrays.toString(a));
    }
}
