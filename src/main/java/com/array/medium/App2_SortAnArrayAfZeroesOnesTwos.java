package com.array.medium;

import java.util.Arrays;
import java.util.List;

public class App2_SortAnArrayAfZeroesOnesTwos {
    static void sortArray(int[] arr) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for (int i : arr) {
            if (i == 0)
                zero++;
            else if (i == 1)
                one++;
            else
                two++;
        }
        int i = 0;
        while (zero != 0) {
            arr[i] = 0;
            i++;
            zero--;
        }
        while (one != 0) {
            arr[i] = 1;
            i++;
            one--;
        }
        while (two != 0) {
            arr[i] = 2;
            i++;
            two--;
        }
    }

    static void sortArrayUsingDutchNationalFlagAlgo(int[] arr) {
        int start = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 2) {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            } else if (arr[mid] == 0) {
                int temp = arr[start];
                arr[start] = arr[mid];
                arr[mid] = temp;
                start++;
                mid++;
            } else {
                mid++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};

        //sortArray(arr);
        sortArrayUsingDutchNationalFlagAlgo(arr);

        System.out.println(Arrays.toString(arr));
    }


}
