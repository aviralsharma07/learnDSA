// Problem Link: https://www.naukri.com/code360/problems/stack-implementation-using-array_3210209

public class Solution{
    static class Stack {
        private int[] arr;
        private int top = -1;
        private int capacity;

        Stack(int capacity) {
            this.capacity = capacity;
            this.arr = new int[capacity];
        }
        public void push(int num) {
            if (isFull() != 1) arr[++top] = num;
        }
        public int pop() {
            if (isEmpty() != 1) return arr[top--];
            return -1;
        }
        public int top() {
            if (isEmpty() != 1) return arr[top];
            return -1;
        }
        public int isEmpty() {
            return (top == -1)?1:0;
        }
        public int isFull() {
            return top == (capacity-1)?1:0;
        }
    }
}
