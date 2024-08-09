// PROBLEM LINK:


// -------------- BRUTE FORCE SOLUTION --------------

class Solution {
    public int longestOnes(int[] arr, int k) {
        int n = arr.length;
        int maxLen = 0;
        for (int i=0; i<n; i++){
            int len = 0;
            int a = k;
            for (int j=i; j<n; j++){
                if (arr[j] == 1) len++;
                else if (arr[j]==0 && a>0){
                    len++;
                    a--;
                }else{
                    break;
                }
            }
            maxLen = Math.max(len,maxLen);
        }

        return maxLen;
    }
}




// ----------------- OPTIMIZED SOLUTION ------------------- 

class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l = 0, r = 0, zeroes = 0, maxLen = 0;
        while (r < n){
            if (nums[r] == 0) zeroes++;
            if (zeroes > k){
                if (nums[l] == 0) zeroes--;
                l++;
            }
            if (zeroes <= k){
                int len = r - l + 1;
                maxLen = Math.max(len,maxLen);
            }
            r++;
         }

         return maxLen;
    }
}
