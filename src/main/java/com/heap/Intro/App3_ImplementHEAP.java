package com.heap.Intro;


import java.util.ArrayList;

public class App3_ImplementHEAP {
    ArrayList<Integer> al = new ArrayList<>();

    void add(int data) {
        // adding data into
        al.add(data); // 10 5

        // upheapify
        upheapify(al.size() - 1);
    }

    public void remove() {
        // first swap 0th and lastindex element
        swap(0, al.size() - 1);
        int val = al.remove(al.size() - 1);

        // downheapify
        downheapify(0);
    }

    private void downheapify(int parentIdx) {
        // find leftchild idx
        int leftChildIdx = 2 * parentIdx + 1;
        int rightChildIdx = 2 * parentIdx + 2;
        int minIdx =  parentIdx;

        if(leftChildIdx < al.size() && al.get(leftChildIdx) < al.get(minIdx)){
            minIdx = leftChildIdx;
        }
        if(rightChildIdx < al.size() && al.get(rightChildIdx) < al.get(minIdx)){
            minIdx = rightChildIdx;
        }
        if(minIdx != parentIdx){
            swap(minIdx,parentIdx);
            downheapify(minIdx);
        }
    }


    private void upheapify(int childIdx) {
        // find parent index;
        int parentIdx = (childIdx - 1) / 2;
        if (al.get(childIdx) < al.get(parentIdx)) {
            swap(childIdx, parentIdx);
            upheapify(parentIdx);
        }
    }

    private void swap(int i, int j) {
        int ithVal = al.get(i);
        int jthVal = al.get(j);
        al.set(i, jthVal);
        al.set(j, ithVal);
    }

    public void display() {
        System.out.println(al);
    }

    public int size() {
        return al.size();
    }

    public boolean isEmpty() {
        return al.isEmpty();
    }

    public static void main(String[] args) {
        App3_ImplementHEAP app = new App3_ImplementHEAP();
        app.add(10);
        app.add(20);
        app.add(30);
        app.add(3);
        app.display();

        app.remove();
        app.display();
    }
}
