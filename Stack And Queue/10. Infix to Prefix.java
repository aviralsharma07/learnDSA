public static String infixToPrefix(String infix) {
        StringBuilder prefix = new StringBuilder();
        Stack<Character> operators = new Stack<>();
        
        // Reverse the infix expression
        infix = new StringBuilder(infix).reverse().toString();
        
        // Iterate through each character in the reversed infix expression
        for (char ch : infix.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                prefix.append(ch); // Append operands directly to the prefix expression
            } else if (ch == ')') {
                operators.push(ch); // Push ')' onto the stack
            } else if (ch == '(') {
                // Pop operators from the stack and append to the prefix until ')' is encountered
                while (!operators.isEmpty() && operators.peek() != ')') {
                    prefix.append(operators.pop());
                }
                operators.pop(); // Pop '(' from the stack
            } else if (isOperator(ch)) {
                // Pop operators with higher or equal precedence and append to the prefix
                while (!operators.isEmpty() && precedence(ch) <= precedence(operators.peek())) {
                    prefix.append(operators.pop());
                }
                operators.push(ch); // Push the current operator onto the stack
            }
        }
        
        // Append any remaining operators on the stack to the prefix expression
        while (!operators.isEmpty()) {
            prefix.append(operators.pop());
        }
        
        // Reverse the prefix expression to get the final result
        return prefix.reverse().toString();
    }
