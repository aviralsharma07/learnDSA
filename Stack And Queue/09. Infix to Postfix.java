// Problem Link: https://www.naukri.com/code360/problems/day-23-:-infix-to-postfix-_1382146

public class Solution {
    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> operators = new Stack<>();
        
        // Iterate through each character in the infix expression
        for (char ch : infix.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch); // Append operands directly to the postfix expression
            } else if (ch == '(') {
                operators.push(ch); // Push '(' onto the stack
            } else if (ch == ')') {
                // Pop operators from the stack and append to the postfix until '(' is encountered
                while (!operators.isEmpty() && operators.peek() != '(') {
                    postfix.append(operators.pop());
                }
                operators.pop(); // Pop '(' from the stack
            } else if (isOperator(ch)) {
                // Pop operators with higher or equal precedence and append to the postfix
                while (!operators.isEmpty() && precedence(ch) <= precedence(operators.peek())) {
                    postfix.append(operators.pop());
                }
                operators.push(ch); // Push the current operator onto the stack
            }
        }
        
        // Append any remaining operators on the stack to the postfix expression
        while (!operators.isEmpty()) {
            postfix.append(operators.pop());
        }
        
        return postfix.toString();
    }
    public static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }

    public static int precedence(char ch) {
        switch (ch) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }
    }
}
