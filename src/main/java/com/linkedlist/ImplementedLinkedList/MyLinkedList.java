package com.linkedlist.ImplementedLinkedList;

class LinkedListImplementation {
    private class Node {
        int data;
        Node next;
    }

    private int size;
    private Node head;
    private Node tail;

    public void display() {
        if (this.size == 0) {
            System.out.println("no data found");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if (this.size == 0) {
            this.head = newNode;
            this.tail = newNode;
            this.size++;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
            this.size++;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if (this.size == 0) {
            this.head = this.tail = newNode;
            this.size++;
        } else {
            newNode.next = this.head;
            this.head = newNode;
            this.size++;
        }
    }

    public int getFirst() {
        if (this.size == 0) {
            System.out.println("no data found");
        }
        return this.head.data;
    }


    public int getLast() {
        if (this.size == 0) {
            System.out.println("no data found");
        }
        return this.tail.data;
    }

    public int getAt(int idx) {
        if (this.size == 0) {
            System.out.println("no data found");
        }
        Node temp = this.head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int removeFirst() {
        if (this.size == 0) {
            System.out.println("no data found");
        }
        int rv = this.head.data;
        if (this.size == 1) {
            this.head = this.tail = null;
            this.size--;
        } else {
            this.head = this.head.next;
            this.size--;
        }
        return rv;
    }

    public int removeLast() {
        if (this.size == 0) {
            System.out.println("no data found");
        }
        int rv = this.tail.data;
        if (this.size == 1) {
            this.head.next = null;
            this.tail.next = null;
            this.size--;
        }
        return rv;
    }

    public int getMid() {
        if (this.size == 0) {
            System.out.println("no data found");
        }
        Node slowNode = this.head;
        Node fastNode = this.head;
        while (slowNode.next != null && fastNode.next.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        return slowNode.data;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }
}

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedListImplementation l1 = new LinkedListImplementation();
        l1.addFirst(10);
        l1.addLast(20);
        l1.addFirst(0);
        l1.display();
    }
}
