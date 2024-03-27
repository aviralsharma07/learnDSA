// Problem Link: https://leetcode.com/problems/reverse-nodes-in-k-group/description/ 

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevLast = null;

        while (temp != null){

            ListNode KthNode = getKthNode(temp, k);

            if (KthNode == null){
                if (prevLast != null){
                    prevLast.next = temp;
                }
                break; 
            }

            ListNode nextNode = KthNode.next;
            KthNode.next = null;
            reverseLinkedList(temp);

            if (temp == head){
                head = KthNode;
            }else{
                prevLast.next = KthNode;
            }

            prevLast = temp;
            temp = nextNode;
        }

        return head;
    }

    public ListNode getKthNode(ListNode temp, int k){
        k -= 1;
        while (temp != null && k > 0){
            k -= 1;
            temp = temp.next;
        }
        return temp;
    }

    public ListNode reverseLinkedList(ListNode head){
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
