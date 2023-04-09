package com.hashing;

import com.sun.source.tree.Tree;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfArrayElements {
    public static void main(String[] args) {
        int arr[] = {10,1,11,2,20,3};
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        // sorting of hashmap using treemap
        TreeMap tm = new TreeMap(hm);

//        System.out.println(tm.pollFirstEntry());
//        System.out.println(tm.pollLastEntry());

    }
}
