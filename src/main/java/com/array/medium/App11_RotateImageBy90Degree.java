package com.array.medium;

public class App11_RotateImageBy90Degree {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // 7,4,1
        // 8,5,2
        // 9,6,3

        // transposing matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // swapping colum
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length - j - 1];
                arr[i][arr.length - j - 1] = temp;
            }
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
