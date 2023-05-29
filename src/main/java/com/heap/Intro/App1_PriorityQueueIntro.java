package com.heap.Intro;

import java.util.*;

public class App1_PriorityQueueIntro {
    public static void main(String[] args) {
        /*

        // in normal queue there is no priority here FIFO has been followed
        Queue<Integer> q = new LinkedList<>();
        q.add(3);
        q.add(4);
        q.add(1);
        q.add(7);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        */



        // here in priority queue FIFO is not going to be followed doesn't matter in which sequence element
        // get inserted , priority always goes to the small number
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // the element which have smaller number will have higher priority
        pq.add(3); // O(logN)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.peek()); // O(1)
            pq.remove(); // O(logN)
        }

    }
}
