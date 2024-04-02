// Problem Link: https://www.naukri.com/code360/problems/implement-queue-using-arrays_8390825

public class Solution {
    class Queue {
        int front, rear;
        int []arr;

        Queue() {
            front = 0;
            rear = 0;
            arr = new int[100001];
        }

        // Enqueue (add) element 'e' at the end of the queue.
        public void enqueue(int e) {
            if (rear <= arr.length-1) arr[rear++] = e;
        }

        // Dequeue (retrieve) the element from the front of the queue.
        public int dequeue() {
            if (front > rear){
                front = rear = 0;
            }
            if (front == rear) return  -1;
            return arr[front++];
        }
    }
}
