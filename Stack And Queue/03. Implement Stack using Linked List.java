// Problem Link: https://www.naukri.com/code360/problems/implement-stack-with-linked-list_1279905


public class Solution {
    static class Stack {
        Node head;
        int size = 0;

        Stack(){}

        int getSize()
        {
            return size;
        }

        boolean isEmpty()
        {
            return head == null;
        }

        void push(int data)
        {
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
            size++;
        }

        void pop()
        {
            if (isEmpty()) return;
            head = head.next;
            size--;
        }

        int getTop()
        {
            if (!isEmpty()) return head.data;
            return -1;
        }
    }
}
