// Problem Link: https://leetcode.com/problems/valid-parentheses/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        if (s.length() == 1) return false;
        int i = 0;
        while(i < s.length()){
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '['){
                stk.push(c);
            }else {
                if (stk.isEmpty()) return false;
                char top = stk.pop();
                if (c == ')' && top != '(' || c == ']' && top != '[' || c == '}' && top != '{'){
                    return false;
                }
            }
            i++;
        }

        return stk.isEmpty();
    }
}
