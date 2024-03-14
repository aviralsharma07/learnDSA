// Creating a Node
public class Node {
    int data;
    Node next;

    Node (int data){
        this.data = data;
        this.next = null;
    }
    Node (int data, Node next){
        this.data = data;
        this.next = next;
    }
}


public class LinkedList {
    Node head;
    LinkedList(){
        this.head = null;
    }

    void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to insert a new node at the end of the list
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    void deleteElement(){
        Node current = head;
        while (current != null){

        }
    }

    void deleteHead(){
        if (head != null){
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
    }

    void deleteTail(){
        if (head == null || head.next == null) return;
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    void printList(){
        Node current = head;
        while (current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}



public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int[] array = {2,7,13,19,23,51,77,97};
        LinkedList lst = arrayToLinkedList(array);
        lst.deleteHead();
        lst.deleteTail();
        lst.printList();
    }

    public static LinkedList arrayToLinkedList(int[] arr){
        LinkedList list = new LinkedList();
        for (int i: arr){
            list.insertAtEnd(i);
        }
        return list;
    }
}
