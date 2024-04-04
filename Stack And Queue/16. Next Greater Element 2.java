// Problem Link: https://leetcode.com/problems/next-greater-element-ii/

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[n];
        for (int i = 2*n-1; i>=0; i--){
            while (!s.isEmpty() && s.peek()<=nums[i%n]){
                s.pop();
            }

            if (i < n){
                if (!s.isEmpty()) ans[i] = s.peek();
                else ans[i] = -1;
            }

            s.push(nums[i%n]);
        }

        return ans;
    }
}
