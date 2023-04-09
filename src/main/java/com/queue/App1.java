package com.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class App1 {
    public static void main(String[] args) {
        Queue q = new PriorityQueue();
        q.add(10);
        q.add(11);
        q.add(12);
        q.add(13);
        System.out.println(q);

        Iterator itr = q.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }
}
