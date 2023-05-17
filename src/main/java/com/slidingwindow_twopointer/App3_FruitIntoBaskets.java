package com.slidingwindow_twopointer;

import java.util.HashMap;
import java.util.Map;

public class App3_FruitIntoBaskets {
    public static void main(String[] args) {
        int N = 3;
        // int[] fruits = {2, 1, 2};
        int[] fruits = {0, 1, 2, 2, 2, 2 };
        int pickedFruits=0;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i : fruits){
            hm.put(i,hm.getOrDefault(i,0)+1);
            pickedFruits++;
        }

        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(pickedFruits);
    }
}
