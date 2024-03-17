// Problem Link: https://leetcode.com/problems/sort-list/description/

/*
------------------ BRUTE FORCE SOLUTION ------------------ 
   1. Store the values of Linked List in an Array / ArrayList.
   2. Sort this ArrayList / Array.
   3. Store the newly sorted values in the same order in the Linked List and return the head.
*/

public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        while (temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(list);
        temp = head;
        int i = 0;
        while (temp != null){
            temp.val = list.get(i);
            i++;
            temp = temp.next;
        }
        return head;
    }

/*
------------------ OPTIMIZED SOLUTION: MERGE SORT ------------------ 
*/


class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        
        // Find the middle of the Linked List
        ListNode mid = findMiddle(head);
        ListNode midNext = mid.next;
        mid.next = null;

        // Recursively sort the two halves
        ListNode left = sortList(head);
        ListNode right = sortList(midNext);

        // Merge the sorted Halves
        return merge(left,right);
    }

    // Method to find the middle of the Linked List
    public ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Method to merge two sorted linked lists
    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // Attach the remaining nodes of the non-empty list
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        return dummy.next;
    }
}
