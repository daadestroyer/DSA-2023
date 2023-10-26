package com.stack;

import java.util.Arrays;

public class App05_TrappingRainWater {

    public static int getTotalWater(int[] height){
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int totalWater = 0;

        left[0] = height[0];
        for(int i=1 ; i<n ; i++){
            left[i] = Math.max(left[i-1],height[i]);
        }
        System.out.println(Arrays.toString(left));
        right[n-1] = height[n-1];
        for(int i=n-2 ; i>=0 ; i--){
            right[i] = Math.max(right[i+1],height[i]);
        }
        System.out.println(Arrays.toString(right));
        for(int i=0 ; i<n ; i++){
            totalWater += Math.min(left[i],right[i])-height[i];
        }
        return totalWater;
    }
    public static void main(String[] args) {
        int[] height = {2,1,5,6,2,3};
        System.out.println(getTotalWater(height));
    }
}
