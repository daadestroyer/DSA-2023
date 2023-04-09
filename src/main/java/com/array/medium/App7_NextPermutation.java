package com.array.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class App7_NextPermutation {

    private static List<Integer> nextPermutation(List<Integer> A) {
        int n = A.size();
        int idx = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (A.get(i) < A.get(i + 1)) {
                idx = i;
                break;
            }
        }

        // if no breakpoint
        if (idx == -1) {
            Collections.reverse(A);
            return A;
        }

        for (int i = n - 1; i > idx; i--) {
            if (A.get(i) > A.get(idx)) {
                int temp = A.get(i);
                A.set(i, A.get(idx));
                A.set(idx, temp);
                break;
            }
        }
        List<Integer> sublist = A.subList(idx + 1, n);
        Collections.reverse(sublist);
        return sublist;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 4, 3, 0, 0};

        List<Integer> A = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> res = nextPermutation(A);
        System.out.println(res);
    }


}
