package com.linkedlist.programs;

public class App5_AddTwoLinkedListNumbers {
    public static void main(String[] args) {
        /*
             2 -> 4 -> 3
             5 -> 6 -> 4
             ------------
             7 -> 0 -> 7

             public ListNode addTwoNumbers(Node l1, Node l2) {
                Node newHead  = new Node();
                Node temp = newHead;
                int carry = 0;

                while(l1 != null || l2 != null || carry==1){
                    int sum = 0;

                    if(l1 != null){
                        sum += l1.val;
                        l1 = l1.next;
                    }
                    if(l2 != null){
                        sum += l2.val;
                        l2 = l2.next;
                    }
                    sum += carry;
                    carry = sum / 10;
                    Node node = new Node();
                    node.val = sum % 10;
                    temp.next = node;
                    temp = temp.next;
                }
                return newHead.next;
             }



        */


    }
}
