package com.heap.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class App9_FindKthTopMostRepetitiveWordInAString {
    public static void main(String[] args) {
        String s = "hi my name is java nigam is i love to java in java because it is very good name";
        int k = 2;
        String[] words = s.split("\\s");
        Map<String,Integer> hm = new HashMap<>();
        for(String w : words){
            hm.put(w,hm.getOrDefault(w,0)+1);
        }
        System.out.println(hm);
        PriorityQueue<String> pq = new PriorityQueue<>((a, b)->hm.get(b)-hm.get(a));
        for(Map.Entry<String,Integer> entry : hm.entrySet()){
            pq.add(entry.getKey());
        }

        while(k-->0){
            System.out.println(pq.poll());
        }
    }
}
