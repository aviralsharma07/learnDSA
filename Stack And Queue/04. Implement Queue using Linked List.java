// Problem Link: https://www.naukri.com/code360/problems/implement-queue-using-linked-list_8161235


/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 class Queue{
     Node front;
     Node rear;
     void push(){};
     Queue() {
         front = null;
         rear = null;
     }
 }

 *****************************************************************/

public class Solution extends Queue{
    public void push(int x) {
        Node temp = new Node(x);
        if (front == null){
            front = temp;
            rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
    }

    public int pop() {
        if (front == null){
            return -1;
        }
        int poppedElem = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return poppedElem;
    }
}
