package com.heap.Intro;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class Student implements Comparable<Student> {
    String name;
    int rank;

    public Student(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        return this.rank - o.rank;
    }
}
public class App2_PriorityQueueIntro2 {

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        // here students are getting sort based on rank
        pq.add(new Student("A",4));
        pq.add(new Student("B",5));
        pq.add(new Student("C",2));
        pq.add(new Student("D",12));

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }

         
    }
}
