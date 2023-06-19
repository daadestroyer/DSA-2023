package com.array.medium;

import java.util.Arrays;
import java.util.stream.Collectors;

public class App1_RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] a = {3, 1, -2, -5, 2, -4};
        int pos = 0;
        int neg = 1;
        int[] res = new int[a.length];
        for(int i=0 ; i<a.length ; i++){
            if(a[i] > 0){
                res[pos] = a[i];
                pos+=2;
            }
            else{
                res[neg] = a[i];
                neg+=2;
            }
        }

        System.out.println(Arrays.toString(res));
    }
}
