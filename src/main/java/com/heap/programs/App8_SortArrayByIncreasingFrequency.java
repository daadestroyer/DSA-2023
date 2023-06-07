package com.heap.programs;

import java.util.*;

public class App8_SortArrayByIncreasingFrequency {

    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        List<Integer> al = new ArrayList<>();
        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        // created min heap and sorting elements on the basis of values of map(frequency)
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> hm.get(a) == hm.get(b) ? b - a : hm.get(a) - hm.get(b));
        for (int i : nums) {
            pq.add(i);
        }

        while (!pq.isEmpty()) {
            al.add(pq.poll());
        }

        return al.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3};
//        int[] nums = {2, 3, 1, 3, 2};
        int[] res = frequencySort(nums);
        System.out.println(Arrays.toString(res));
    }
}
