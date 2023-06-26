package com.linkedlist.programs;

public class App4_RemoveNthNodeFromBackOfTheLinkedList {
    /*
        1 -> 2 -> 3 -> 4 -> 5 . n = 2;
        public Node removeNthFromEnd(Node head, int n) {
            Node temp = new Node();
            temp.next = head;

            Node slow = temp;
            Node fast = temp;

            for(int i=0 ; i<n ; i++){
                fast = fast.next;
            }

            while(fast.next != null){
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
            return temp.next;
        }
    */
}
