// Problem Link: https://leetcode.com/problems/reverse-linked-list/description/

/*
------------- Brute Force Iterative Solution-------------
*/

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current !=  null){
            ListNode next = current.next;

            // Reverse the Direction of the Pointers
            current.next = prev;

            // Move Pointers one step forward
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
}


/*
------------- Recursive Solution-------------
*/

public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newHead = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return newHead; 
    }
