import java.util.Stack;

public class Solution {
    public String postfixToInfix(String postfix) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                stack.push(Character.toString(ch));
            } else {
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                String result = "(" + operand1 + ch + operand2 + ")";
                stack.push(result);
            }
        }

        return stack.pop();
    }
}
