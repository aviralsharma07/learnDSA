// Problem Link: https://leetcode.com/problems/rotate-string/

class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        boolean ans = false;
        for (int i=0; i<=n-1; i++){
            String shiftedStr = s.substring(i+1,n) + s.substring(0,i+1);
            if (goal.equals(shiftedStr)) {
                ans = true;
                break;
            }
        }
        return ans;
    }
}
