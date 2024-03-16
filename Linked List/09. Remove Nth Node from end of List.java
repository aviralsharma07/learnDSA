// Problem Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

public ListNode removeNthFromEnd(ListNode head, int n) {

        // Count the Number of Elements in the Linked List
        ListNode temp = head;
        int count = 0; 
        while (temp != null){
            count++;
            temp = temp.next;
        }
        n = count - n + 1; // Nth element from first 
        if (count == 1) {
            head = null;
            return head;
        }
        if(n == 1) {
            head = head.next;
            return head;
        }
        count = 1;
        ListNode current = head;
        ListNode previous = head;

        while (current != null){
            if (count == n){
                previous.next = current.next;
                break;
            }
            count++;
            previous = current;
            current = current.next;
        }
        return head;
    }
