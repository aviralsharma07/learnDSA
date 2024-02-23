// https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/
class Solution {
    public int maxDepth(String s) {
        int depth = 0, open = 0;
        for (char c: s.toCharArray()){
            if (c == '(') open++;
            if (c == ')') open--;
            depth = Math.max(depth,open);
        }
        return depth;
    }
}
