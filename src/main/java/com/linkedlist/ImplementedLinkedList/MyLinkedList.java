package com.linkedlist.ImplementedLinkedList;

import java.util.*;
import java.util.stream.Collectors;

class LinkedListImplementation {
    private class Node {
        int data;
        Node next;
    }

    private int size;
    private Node head;
    private Node tail;

    public boolean detectLoopInLinkedList(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public Node findMiddleOfLinkedList(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node reverse(Node ptr) {
        Node prev = null;
        Node curr = null;

        while (curr != null) {
            curr = ptr.next;
            ptr.next = prev;
            prev = ptr;
            ptr = curr;
        }
        return prev;
    }

    public boolean isPallindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = reverse(slow.next);

        slow = slow.next;
        Node dummyNode = head;

        while (slow != null) {
            if (dummyNode.data != slow.data) {
                return false;
            }
        }
        return true;
    }

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
//        LinkedListImplementation l1 = new LinkedListImplementation();
//        l1.addFirst(10);
//        l1.addLast(20);
//        l1.addFirst(0);
//        l1.display();
        List<Integer> odd = new ArrayList<>();
        odd.add(1);
        odd.add(2);
        odd.add(3);
        odd.add(4);

        //System.out.println(odd);
        odd.remove(0);
        //System.out.println(odd);
        //odd.remove(0);
//        Set<Integer> st = new HashSet<>();
//
//        st.add(10);
//        Iterator str = st.iterator();
//        while(str.hasNext()){
//            int a = (int)str.next();
//        }

        //   System.out.println(77270+70485+145725+70465+70465+74190+72000+72000+110000+75000+75000+75000+20000+20000+14190);


        System.out.println(0%2);


    }
}
