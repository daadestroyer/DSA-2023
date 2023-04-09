package com.array.medium;

import java.util.ArrayList;
import java.util.List;

public class App12_SpiralMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<Integer> list = new ArrayList<>();
        int top = 0;
        int left = 0;
        int right = mat[0].length - 1;
        int bottom = mat.length - 1;
        int count = (bottom + 1) * (right + 1);
        int dir = 1;

        while (top <= bottom && left <= right) {
            if (count > 0) {
                if (dir == 1) {
                    for (int i = top; i <= right; i++) {
                        list.add(mat[left][i]);
                        count--;
                    }
                }
            }
            dir = 2;
            top++;
            if (count > 0) {
                if (dir == 2) {
                    for (int i = top; i <= bottom; i++) {
                        list.add(mat[i][right]);
                        count--;
                    }
                }
            }
            dir = 3;
            right--;
            if (count > 0) {
                if (dir == 3) {
                    for (int i = right; i >= left; i--) {
                        list.add(mat[bottom][i]);
                    }
                }
            }

            dir = 4;
            bottom--;
            if (count > 0) {
                if (dir == 4) {
                    for (int i = bottom; i >= top; i--) {
                        list.add(mat[i][left]);
                        count--;
                    }
                }
            }

            dir = 1;
            left++;
        }
        // System.out.println(list);
        System.out.println(list.subList(0, 3));
        System.out.println(list.subList(3, 6));
        System.out.println(list.subList(6, 9));

    }
}
