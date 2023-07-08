import java.util.HashMap;

public class MaximumSubArray {

    /*
         Question Link: https://leetcode.com/problems/maximum-subarray/
         Brute Force Solution: - Run Two Loops
                               - Outer Loop to track all sub-arrays starting from each element
                               - Inner Loop to find and compare the sum of all sub-arrays staring from ith element
                               - Time Complexity: O(N*N)
                               - Space Complexity: O(1)

         Better Solution: - Kadane Algorithm
                          - Initialize sum = 0;
                          - Iterate through Array and do the following:
                               ~ sum += arr[i]
                               ~ if (sum > max) -> max =  sum;
                               ~ if (sum < 0) -> sum = 0;
                          - Return max as answer i.e., Maximum sum of a Sub-array of arr
                          - Time Complexity: O(N)
                          - Space Complexity: O(1)
    */

    static int maximumSubarray(int[] nums){
        int n = nums.length;
        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;
        int sum = 0;
        int maximumSum = Integer.MIN_VALUE;
        for (int i=0; i<n; i++){
            if (sum == 0) start = i;
            sum += nums[i];
            if (sum > maximumSum){
                maximumSum = sum;
                ansStart = start;
                ansEnd = i;
            }
            sum = Math.max(sum,0);
        }
        System.out.print("Maximum Sum Sub Array is: ");
        for (int i=ansStart; i<=ansEnd; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        return maximumSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSubarray(arr));
    }
}
