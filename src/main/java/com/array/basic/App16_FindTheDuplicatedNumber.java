package com.array.basic;

import java.util.Arrays;

public class App16_FindTheDuplicatedNumber {
    public static void main(String[] args) {
        int[] a = {1,3,4,2,2};
        int[] ans = new int[a.length];

        for(int i : a){
            ans[i]++;
        }
        int res = 0;
       for(int i=0 ; i<ans.length ; i++){
           if(ans[i] > 1){
               res = i;
               break;
           }
       }
        System.out.println(res);
    }
}
