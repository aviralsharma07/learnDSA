import java.util.Stack;

public class Solution {
    public String prefixToInfix(String prefix) {
        Stack<String> stack = new Stack<>();

        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                stack.push(Character.toString(ch));
            } else {
                String operand1 = stack.pop();
                String operand2 = stack.pop();
                String result = "(" + operand1 + ch + operand2 + ")";
                stack.push(result);
            }
        }

        return stack.pop();
    }
}
