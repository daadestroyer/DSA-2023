package com.array.medium;

public class App14_searchInA2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;

        // TC: O(N^) SC:O(1)
        System.out.println(searchMatrix(a, target));
    }
}