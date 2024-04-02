// Problem Link: https://leetcode.com/problems/implement-stack-using-queues/

/* BRUTE FORCE METHOD: USING TWO QUEUES */

class MyStack {
    Queue < Integer > q1 = new LinkedList < > ();
    Queue < Integer > q2 = new LinkedList < > ();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()){
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    
    public int pop() {
        return q1.remove();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}


/* OPTIMIZED SOLUTION: USING SINGLE QUEUE */

class MyStack {
    Queue<Integer> q = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
        for (int i=0; i<q.size()-1; i++){
            q.add(q.peek());
            q.remove();
        }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}
