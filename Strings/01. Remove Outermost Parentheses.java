// Question Link: https://leetcode.com/problems/remove-outermost-parentheses/description/

class Solution {
    public String removeOuterParentheses(String s) {
      
      // CREATE A STACK TO KEEP TRACK OF THE PARENTHESES
        Stack<Character> stack = new Stack<>();

      // A VARIABLE TO KEEP TRACK OF OPEN PARENTHESES
        int openCount = 0;

      // AN EMPTY STRING TO STORE THE RESULT 
        String answer = "";
        for (char c: s.toCharArray()){
            if (c == '('){
                if (openCount > 0){
                  // Add '(' to the result only if it's not the outermost '('
                    answer += c;
                }
                stack.push(c);
                openCount++;
            } else if (c == ')') {
                stack.pop();
                openCount--;
                if (openCount > 0){
                  // Add ')' to the result only if it's not the outermost ')'
                    answer += c;
                }
            }
        }
        return answer;
    }
}
