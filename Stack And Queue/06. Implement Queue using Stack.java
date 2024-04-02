// Problem Link: https://leetcode.com/problems/implement-queue-using-stacks/description/


class MyQueue {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        if (!output.isEmpty()){
            return output.pop();
        }else{
            while(!input.isEmpty()){
                output.push(input.pop());
            }
            return output.pop();
        }

    }
    
    public int peek() {
        if (!output.isEmpty()){
            return output.peek();
        }else{
            while(!input.isEmpty()){
                output.push(input.pop());
            }
            return output.peek();
        }
    }
    
    public boolean empty() {
        return output.isEmpty() && input.isEmpty();
    }
}
