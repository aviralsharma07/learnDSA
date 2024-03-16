// Problem Link: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        int midIndex = sizeOfLL(head)/2;

        if (midIndex == 0){
            head = head.next;
            return head;
        }
        
        int count = 0;
        ListNode current = head;
        ListNode previous = head;

        while (current != null){
            if (count == midIndex){
                previous.next = current.next;
                break;
            }
            count++;
            previous = current;
            current = current.next;
        }

        return head;
    }

    public static int sizeOfLL(ListNode head){
        ListNode temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
