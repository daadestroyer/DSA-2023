package com.array.basic;

public class App17_maximumSubArray_KADANES_ALGO {
    public static void main(String[] args) {
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int currsum = Integer.MIN_VALUE;
        int finalsum = Integer.MIN_VALUE;

        for (int i : a) {
            if (currsum >= 0) {
                currsum = currsum + i;
            }
            else{
                currsum = i;
            }
            if(currsum > finalsum){
                finalsum = currsum;
            }
        }
        System.out.println(finalsum);


    }
}
