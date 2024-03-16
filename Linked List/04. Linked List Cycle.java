// Problem Link: https://leetcode.com/problems/linked-list-cycle/description/


/*
------------------- BRUTE FORCE SOLUTION ------------------- 
   1. Iterate through the Linked List.
   2. Store the Nodes in a HashSet.
   3. Check if the current iterating node is present in HashSet
   4. If it is present -> Return TRUE, if not -> add the node to HashSet.
   5. After Loop ends, Return FALSE. 
*/

/*
------------------- Floyd's Cycle Detection Algorithm (Two Pointers) -------------------
*/

public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> visitedNodes = new HashSet<>();
        ListNode temp = head;
        while (temp != null){
            if(visitedNodes.contains(temp)) return true;
            visitedNodes.add(temp);
            temp = temp.next;
        }
        return false;
    }
}



public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // No cycle if the list is empty or has only one node
        }

        ListNode slow = head;
        ListNode fast = head.next;
        
        // Move the pointers until either the fast pointer reaches the end or they meet
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true; // Cycle detected
            }
            slow = slow.next; // Move slow pointer one step
            fast = fast.next.next; // Move fast pointer two steps
        }
        
        return false; // If we reach the end of the list, there is no cycle
    }
}
