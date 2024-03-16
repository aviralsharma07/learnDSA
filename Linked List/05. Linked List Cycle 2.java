// Problem Link: https://leetcode.com/problems/linked-list-cycle-ii/


public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        HashSet<ListNode> visitedNodes = new HashSet<>();
        while (head != null){
            if (visitedNodes.contains(head)) return head;
            visitedNodes.add(head);
            head = head.next;
        }
        return null;
    }
}
