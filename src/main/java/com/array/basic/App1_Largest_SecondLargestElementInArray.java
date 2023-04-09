package com.array.basic;

public class App1_Largest_SecondLargestElementInArray {
    public static void main(String[] args) {
        int largest = Integer.MIN_VALUE;
        int secondlargest = largest;

        int arr[] = {8, 10, 5, 7, 90};

        for(int i : arr){
            if(i> largest){
                secondlargest = largest;
                largest = i;
            }
            else{
                secondlargest = i;
            }
        }
        System.out.println(largest);
        System.out.println(secondlargest);

    }
}
