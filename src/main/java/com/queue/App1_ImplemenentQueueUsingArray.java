package com.queue;

import java.util.*;

class queue {
    int[] arr;
    int start;
    int end;
    int maxSize;
    int currSize;

    public queue(int maxSize) {
        this.arr = new int[maxSize];
        this.start = -1;
        this.end = -1;
        this.maxSize = maxSize;
        this.currSize = 0;
    }

    void push(int val) {
        if (currSize == maxSize) {
            System.out.println("Queue is full");
            return;
        }
        if (end == -1) {
            start = 0;
            end = 0;
        } else {
            end++;
        }
        arr[end] = val;
        currSize++;
    }

    int pop() {
        if (start == -1) {
            System.out.println("Queue is empty");
        }
        int poppedItem = arr[start];
        if (currSize == 1) {
            start = -1;
            end = -1;
        } else {
            start++;
        }
        currSize--;
        return poppedItem;
    }

    int top() {
        if (start == -1) {
            System.out.println("Queue is empty");
        }
        return arr[start];
    }

    int size() {
        return this.currSize;
    }

    void print() {
        if (currSize == -1) {
            System.out.println("Queue is empty");
            return;
        }
        int ptr = 0;
        for (int i = 0; i < currSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

public class App1_ImplemenentQueueUsingArray {
    public static void main(String[] args) {
//        queue q = new queue(16);
//
//        q.push(10);
//        q.push(20);
//        q.push(30);
//        q.push(40);
//
//        q.print();
//        System.out.println();
//        System.out.println("top = " + q.top());
//        System.out.println("pop = "+q.pop());
//        System.out.println();
//        q.print();
//       System.out.println(Arrays.toString(q.arr));

        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(10);
        dq.addLast(20);
        dq.addLast(30);
        dq.addLast(40);
        System.out.println(dq);
        dq.pop();
        dq.removeFirst();


//        System.out.println(s);
    }
}
