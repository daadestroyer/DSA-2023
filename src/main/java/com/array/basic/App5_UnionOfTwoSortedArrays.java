package com.array.basic;

import java.util.HashSet;
import java.util.Set;

public class App5_UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};

        Set<Integer> st = new HashSet<>();
        for (int i : arr1)
            st.add(i);

        for (int i : arr2)
            st.add(i);


        System.out.println(st);

    }
}
