// PROBLEM LINK: https://www.codingninjas.com/studio/problems/delete-all-occurrences-of-a-given-key-in-a-doubly-linked-list_8160461

public class Solution {
    public static Node deleteAllOccurrences(Node head, int k) {
        if(head == null) return head;
        Node current = head;
        while (current != null){
            if (current.data == k) {
                head = deleteNode(head, current);
            }
            current = current.next;
        }
        return head;
    }

    public static Node deleteNode(Node head, Node current){
        Node back = current.prev;
        Node front = current.next;

        if (front == null && back == null){
            head = null;
        }else if(back == null){
            head.next.prev = null;
            head = head.next;
        }else if(front == null){
            current.prev.next = null;
        }else{
            back.next = front;
            front.prev = back;
        }

        return head;
    }
}
