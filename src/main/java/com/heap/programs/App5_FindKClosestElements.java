package com.heap.programs;

import java.util.*;
import java.util.stream.Collectors;

//        Queue<Integer> pq = new PriorityQueue<>((o1,o2)->{
//            if(Math.abs(o1-x)==Math.abs(o2-x))
//            {
//                if(o1>o2) return -1;
//                return 1;
//            }
//            else if(Math.abs(o1-x)>Math.abs(o2-x)) return -1;
//            else return 1;
//        });

public class App5_FindKClosestElements {

    public List<Integer> findClosestElements(int[] arr, int x, int k) {
        List<Integer> list = new ArrayList<>();

        Queue<Integer> pq = new PriorityQueue<>((a, b) -> (Math.abs(a - x) < Math.abs(b - x)) ? 1 : -1);
//        Queue<Integer> pq = new PriorityQueue<>((a,b)->(a-b));

        for (int i : arr) {
            pq.add(i);
            System.out.println(pq);
            if (pq.size() > k)
                pq.remove();
        }
        System.out.println(pq);
        while (!pq.isEmpty()) {
            list.add(pq.poll());
        }

        Collections.sort(list);
        return list;
    }


    public static void main(String[] args) {
        App5_FindKClosestElements app = new App5_FindKClosestElements();
        int[] arr = {1, 2, 3, 4, 5};
        int x = 3;
        int k = 4;
//        int[] arr = {1,1,1,10,10,10};
//        int x = 9;
//        int k = 1;
        List<Integer> closestElements = app.findClosestElements(arr, x, k);
        System.out.println(closestElements);


    }
}
