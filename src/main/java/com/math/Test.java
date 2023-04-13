package com.math;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        Integer[] arr1 = list.toArray(new Integer[list.size()]);
        for(int i : arr1){
            System.out.println(i);
        }

    }
}
