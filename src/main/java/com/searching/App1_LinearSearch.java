package com.searching;

public class App1_LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{10,22,1,23,2,4};
        int search = 2;

        for(int i : arr){
            if(i == search) {
                System.out.println("Data found");
            }
        }
    }
}
