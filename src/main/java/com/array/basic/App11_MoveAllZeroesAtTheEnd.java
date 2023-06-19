package com.array.basic;

import java.util.Arrays;

public class App11_MoveAllZeroesAtTheEnd {
    public static void moveZeroesAtEnd(int[] nums) {
        int counter = 0;

        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] != 0){
                nums[counter++] = nums[i];
            }
        }
        while(counter < nums.length){
            nums[counter++] = 0;
        }
    }

    public static void moveAllZeroesAtStart(int[] nums){
        int counter = nums.length-1;

        for(int i=nums.length-1 ; i>=0 ; i--){
            if(nums[i] != 0){
                nums[counter--] = nums[i];
            }
        }
        while(counter >= 0){
            nums[counter--] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroesAtEnd(arr);
        System.out.println(Arrays.toString(arr));
        moveAllZeroesAtStart(arr);
        System.out.println(Arrays.toString(arr));
    }
}
