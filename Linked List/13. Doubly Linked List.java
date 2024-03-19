// Node

public class DoubleNode {
    int data;
    DoubleNode next;
    DoubleNode prev;

    DoubleNode(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    DoubleNode(int data, DoubleNode next){
        this.data = data;
        this.next = next;
        this.prev = null;
    }

    DoubleNode(int data, DoubleNode next, DoubleNode prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}


// DOUBLY LINKED LIST

import java.util.ArrayList;
import java.util.Collections;

public class DoubleLinkedList {
    DoubleNode head;
    DoubleLinkedList(){
        this.head = null;
    }

    DoubleLinkedList(int data){
        this.head.data = data;
    }

    void printList(){
        DoubleNode current = head;
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static DoubleLinkedList arrayToDLL(int[] arr){
        DoubleLinkedList list = new DoubleLinkedList();

        if (arr.length == 0) return list;

        list.head = new DoubleNode(arr[0]);

        DoubleNode prev = list.head;
        for (int i=1; i<arr.length; i++){
            DoubleNode temp = new DoubleNode(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
        }
        return list;
    }

    void deleteHead(){
        if (head != null){
            head.next.prev = null;
            head = head.next;
        }
    }

    void deleteTail(){
        DoubleNode current = head;
        while (current != null){
            if (current.next == null){
                current.prev.next = null;
            }
            current = current.next;
        }
    }

    void deleteNthElement(int k){
        if (head == null) return;
        DoubleNode current = head;
        int count = 0;
        while(current != null){
            count++;
            if (count == k){
                break;
            }
            current = current.next;
        }
        DoubleNode back = current.prev;
        DoubleNode front = current.next;

        if (back == null && front == null){
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
    }

    void insertBeforeHead(int n){
        DoubleNode newNode = new DoubleNode(n);
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    void insertBeforeTail(int n){
        DoubleNode current = head;
        DoubleNode newNode = new DoubleNode(n);
        while (current != null){
            if (current.next == null){
                current.prev.next = newNode;
                newNode.prev = current.prev;
                current.prev = newNode;
                newNode.next = current;
            }
            current = current.next;
        }
    }

    void reverseDLL(){
        ArrayList<Integer> values = new ArrayList<>();
        DoubleNode current = head;
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
    }
}
