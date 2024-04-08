// Problem Link: https://leetcode.com/problems/trapping-rain-water/


/* 
------------------------ BRUTE FORCE SOLUTION ------------------------
 1. Iterate through each Height
 2. For each Height: Find Max Height to the Left and to the Right.
 3. Water Stored at that Index = Min(leftHeight, rightHeight) - currentHeight[i]
 4. Add Water stored at each Index.
 
 - Time Complexity: O(n*n)
 - Space Complexity: O(1)
*/ 

/*

------------------------ BETTER SOLUTION: PREFIX AND SUFFIX ARRAY ------------------------
   - Time Complexity: O(n)
   - Space Complexity: O(2*n)
*/

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int maxLeft = height[0], maxRight = height[n-1];
        for (int i = 0; i<n; i++){
            if (height[i] > maxLeft) maxLeft = height[i];
            prefix[i] = maxLeft;
        } // 0 , 1 , 1 , 2 , 2 , 2
        for (int i = n-1; i>=0; i--){
            if (height[i] > maxRight) maxRight = height[i];
            suffix[i] = maxRight;
        }

        int ans = 0;
        for (int i=0; i<n; i++){
            ans += Math.min(prefix[i],suffix[i]) - height[i];
        }

        return ans;
    }
}

/*
------------------------ OPTIMIZED SOLUTION: TWO POINTERS ------------------------
 - Time Complexity: O(n)
 - Space Complexity: O(1)
*/

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0, right = n - 1;
        int res = 0, maxLeft = 0, maxRight = 0;

        while (left <= right){
            if (height[left] <= height[right]){
                if (height[left] >= maxLeft) maxLeft = height[left];
                else res += maxLeft - height[left];
                left++;
            }else{
                if (height[right] >= maxRight) maxRight = height[right];
                else res += maxRight - height[right];
                right--;
            }
        }

        return res;
    }
}
