// Problem: https://leetcode.com/problems/largest-odd-number-in-string/description/

class Solution {
    public String largestOddNumber(String s) {
        String ans = "";
        char[] digits = s.toCharArray();
        for (int i= digits.length-1; i>=0; i--){
            int digit = Character.getNumericValue(digits[i]);
            if (digit%2 != 0){
                ans = s.substring(0,i+1);
                break;
            }
        }
        return ans;
    }
}
