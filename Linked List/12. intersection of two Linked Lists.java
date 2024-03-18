// Problem Link: https://leetcode.com/problems/intersection-of-two-linked-lists/description/

/*
------------------- BRUTE FORCE APPROACH ---------------------
  1. Store the elements of one Linked List in HashSet.
  2. Iterate the Second Linked List and for each Node check if:
      map.contains(node).
  3. If it does -> return node, else continue;
  4. return null after loop ends
*/

public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet();
        ListNode temp = headA;
        while (temp != null){
            set.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while (temp != null){
            if (set.contains(temp)) return temp;
            temp = temp.next;
        }
        return null;
    }
