package com.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App12_SpiralMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        ArrayList<Integer> al = new ArrayList<>();
        int top = 0;
        int left = 0;
        int right = mat[0].length - 1;
        int bottom = mat.length - 1;
        int count = (right) * (bottom);
        int dir = 1;

        while (top <= right && left <= bottom) {
            if (count > 0 && dir == 1) {
                for (int i = top; i <= right; i++) {
                    al.add(mat[left][i]);
                }
            }
            dir = 2;
            top++;
            if (count > 0 && dir == 2) {
                for(int i=top ; i<=bottom ; i++){
                    al.add(mat[i][right]);
                }
            }
            dir = 3;
            right--;
            if(count > 0 && dir == 3){
                for(int i=right ; i>= left ; i--){
                    al.add(mat[bottom][i]);
                }
            }
            dir = 4;
            bottom--;
            if(count > 0 && dir == 4){
                for(int i=bottom ; i>=top ; i--){
                    al.add(mat[i][left]);
                    count--;
                }
            }
            dir = 1;
            left++;
        }


         System.out.println(al);
        System.out.println(al.subList(0, 3));
        System.out.println(al.subList(3, 6));
        System.out.println(al.subList(6, 9));

    }
}
