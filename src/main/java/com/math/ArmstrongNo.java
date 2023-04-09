package com.math;

public class ArmstrongNo {
    static boolean armStrong(int num) {
        // get the last num
        int originalNo = num;
        int temp = num;
        int sum = 0;
        int count = 0;

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        while (num != 0) {
            int lastNum = num % 10;
            sum += Math.pow(lastNum, count);
            num = num / 10;
        }
        return originalNo == sum;
    }

    public static void main(String[] args) {
        int n = 153;
        if (armStrong(n)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
