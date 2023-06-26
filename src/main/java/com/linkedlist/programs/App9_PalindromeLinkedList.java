package com.linkedlist.programs;

public class App9_PalindromeLinkedList {
    public static void main(String[] args) {
        /*
           1 -> 2 -> 1 -> 1


                public boolean isPalindrome(ListNode head) {
                    ListNode slow = head;
                    ListNode fast = head;

                    while(fast.next != null && fast.next.next != null){
                        slow = slow.next;
                        fast = fast.next.next;
                    }

                    slow.next = reverse(slow.next);

                    slow = slow.next;
                    ListNode d = head;
                    while(slow != null){
                        if(d.val != slow.val){
                            return false;
                        }
                        d = d.next;
                        slow = slow.next;
                    }
                    return true;
                }
                private static ListNode reverse(ListNode ptr){
                    ListNode prev = null;
                    ListNode curr = null;

                    while(ptr != null){
                      curr = ptr.next;
                      ptr.next = prev;
                      prev = ptr;
                      ptr = curr;
                    }
                    return prev;
                }
        */
    }
}
