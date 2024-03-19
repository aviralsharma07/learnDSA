// Problem Link: https://www.codingninjas.com/studio/problems/reverse-a-doubly-linked-list_1116098

// -------------- BRUTE FORCE SOLUTION ---------------

public static Node reverseDLL(Node head)
    {
        ArrayList<Integer> values = new ArrayList<>();
        Node current = head;
        while (current != null){
            values.add(current.data);
            current = current.next;
        }
        Collections.reverse(values);
        current = head;
        int i = 0;
        while (current != null){
            current.data = values.get(i++);
            current = current.next;
        }
        return head;
    }

// -------------- OPTIMIZED SINGLE PASS SOLUTION ---------------

public class DoubleLinkedList {
    DoubleNode head;

    // Constructor and other methods...

    public void reverse() {
        DoubleNode current = head;
        DoubleNode temp = null;

        while (current != null) {
            // Swap prev and next pointers
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            // Move to the next node
            current = current.prev;
        }

        // Update the head pointer
        if (temp != null) {
            head = temp.prev;
        }
    }
}
