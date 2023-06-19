package com.array.basic;

public class App10_maxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int finalCount=0;
        int tempCount = 0;

        for(int i : nums){
            if(i == 1){
                tempCount++;
                finalCount = Math.max(finalCount,tempCount);
            }
            else{
                tempCount = 0;
            }
        }
        return finalCount;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        int ans = findMaxConsecutiveOnes(arr);
        System.out.println(ans);
    }
}
