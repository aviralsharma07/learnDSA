// Problem Link: https://leetcode.com/problems/min-stack/

/* --------------- BRUTE FORCE SOLUTION ----------------: 
     Time Complexity: O(1);
     Space Complexity: O(N);
*/

class MinStack {
    Stack<Integer> stk = new Stack<>();
    Stack<Integer> mini = new Stack<>();
    int min = Integer.MAX_VALUE;
    public MinStack() {
        
    }
    
    public void push(int val) {
        stk.push(val);
        min = Math.min(min,val);
        mini.push(min);
    }
    
    public void pop() {
        stk.pop();
        mini.pop();
        if (!mini.isEmpty()) {
            min = mini.peek();
        } else {
            min = Integer.MAX_VALUE; // Reset min if the stack becomes empty
        }
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return mini.peek();
    }
}

/* --------------- OPTIMIZED SOLUTION ----------------: 
     Time Complexity: O(1);
     Space Complexity: O(1);
     PUSH OPERATION: currentElement = 2*currentElement - previousMinimum
     POP OPERATION: minimumELement = 2*minimumElement - currentElement
*/

class MinStack {
    Stack<Long> stk = new Stack<>();
    Long min; 
    public MinStack() {
        min = Long.MAX_VALUE;
    }
    
    public void push(int value) {
        Long val = Long.valueOf(value);
        if (stk.isEmpty()){
            stk.push(val);
            min = val;
        }else{
            if (val < min){
                stk.push(2*val - min);
                min = val;
            }else{
                stk.push(val);
            }
        }
    }
    
    public void pop() {
        if (!stk.isEmpty()){
            if (stk.peek() > min){
                stk.pop();
            }else{
                min = 2*min - stk.peek();
                stk.pop();
            }
        }
    }
    
    public int top() {
        if(stk.isEmpty()) return -1;
        Long q = stk.peek();
        if (q < min) return min.intValue();
        if (q>=min) return q.intValue();

        return 0;
    }
    
    public int getMin() {
        if (stk.isEmpty()) return -1;
        return min.intValue();
    }
}
