// Problem Link: https://leetcode.com/problems/next-greater-element-i/

/*
------------------------- BRUTE FORCE SOLUTION -------------------------
  1. Iterate through Array 1 and for each element of Array 1 arr[i]:
  2. Find its index in Array 2. Initilize max = arr2[index] and for each arr2[index]:
  3. Find the next maximum element and store it in max and break the inner loop.
  4. If max has changed -> we have find next greater element so answer[i] = max, if not then we haven't so, answer[i] = -1;
  5. return answer array: ans
*/

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n];
        for (int i=0; i<n; i++){
            int index = findIndex(nums1[i],nums2);
            int max = nums2[index];
            for (int j=index+1; j<m; j++){
                if (nums2[j] > max){
                    max = nums2[j];
                    break;
                }
            }
            if(max != nums2[index]){
                ans[i] = max;
            }else{
                ans[i] = -1;
            }
        }
        return ans;
    }

    public static int findIndex(int target, int[] arr){
        int i=0;
        for (i=0; i<arr.length; i++){
            if (arr[i] == target) break;
        }
        return i;
    }
}


/*
----------------------- OPTIMIZED SOLUTION: MONOTONIC STACK -----------------------
*/

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[m];
        Stack<Integer> stack = new Stack<>();
        for (int i = m-1; i>=0; i--){
            while (!stack.isEmpty() && stack.peek()<=nums2[i]){
                stack.pop();
            }
            if (i < m){
                if (!stack.isEmpty()) ans[i] = stack.peek();
                else ans[i] = -1;
            }
            stack.push(nums2[i]);
        }

        int[] result = new int[n];
        for (int i=0; i<n; i++){
            int index = findIndex(nums1[i], nums2);
            result[i] = ans[index];
        }

        return result;
    }

    public static int findIndex(int target, int[] arr){
        int i=0;
        for (i=0; i<arr.length; i++){
            if (arr[i] == target) break;
        }
        return i;
    }
}
