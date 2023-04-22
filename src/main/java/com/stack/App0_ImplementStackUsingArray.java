package com.stack;

import java.util.Stack;

class stack {
    int size = 10000;
    int[] arr = new int[size];
    int top = -1;

    void push(int val) {
        top++;
        arr[top] = val;
    }

    int pop() {
        int val = arr[top];
        top--;
        return val;
    }

    int peek() {
        int val = arr[top];
        return val;
    }

    int size() {
        return top + 1;
    }

    void print() {
        int limit = 0;
        while (limit != top+1) {
            System.out.print(arr[limit] + " ");
            limit++;
        }
    }
}

public class App0_ImplementStackUsingArray {
    public static void main(String[] args) {
        Stack st = new Stack();

        stack s = new stack();
        s.push(10);
        s.push(11);
        s.push(12);
        s.push(13);
        s.print();
        System.out.println();
        System.out.println("size = " + s.size());

        System.out.println(s.peek());
        System.out.println(s.pop());
        s.print();
        //System.out.println(s.pop());
    }
}
