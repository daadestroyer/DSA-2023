package com.array.medium;

import java.util.Arrays;

public class App10_SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};

        int[][] res = setMatrixZero(matrix, matrix.length, matrix[0].length);

        System.out.println(Arrays.toString(res[0]) + ":" + Arrays.toString(res[1]) + ":" + Arrays.toString(res[2]));


    }

    private static int[][] setMatrixZero(int[][] matrix, int row, int col) {

        boolean changed = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    changed = true;
                    changeData(matrix, i, j, row, col);
                }
            }
        }

        if (changed) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (matrix[i][j] == -1) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        return matrix;
    }

    private static void changeData(int[][] matrix, int R, int C, int rowsize, int colsize) {
        int i = R;
        int j = C;

        // right side
        while (j < colsize) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
                j++;
            } else {
                j++;
            }
        }
        i = R;
        j = C;
        // left side
        while (j >= 0) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
                j--;
            } else {
                j--;
            }
        }
        i = R;
        j = C;
        // upper side
        while (i >= 0) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
                i--;
            } else {
                i--;
            }
        }
        i = R;
        j = C;
        // down side
        while (i < rowsize) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
                i++;
            } else {
                i++;
            }

        }
    }
}
