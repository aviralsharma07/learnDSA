import java.util.HashMap;

public class SubarraysWithGivenSum {

    /*
        Problem Link: https://leetcode.com/problems/subarray-sum-equals-k/
        Brute Force Solution: - Run Two Loops and initialize count  = 0;
                              - Outer Loop to set element and initialize sum = 0;
                              - Inner Loop from j = i to find all sub-arrays starting from that element.
                              - For every sub-array with sum == k, increment count by 1
                              - Time Complexity: O(N*N)
                              - Space Complexity: O(1)

        Optimal Solution: - Use of Prefix Sum
                          - Time Complexity: O(N)
                          - Space Complexity: O(N)
    */

    static int countSubArrays(int[] arr, int k){
        int n = arr.length;
        HashMap<Integer,Integer> prefixSum = new HashMap<>();
        int count  = 0;
        int sum = 0;

        prefixSum.put(0,1);

        for (int i=0; i<n; i++){

            // add current element to prefix Sum:
            sum += arr[i];

            // Calculate x-k:
            int remove = sum - k;

            // Add the number of subarrays to be removed:
            count += prefixSum.getOrDefault(remove,0);

            // Update the count of prefix sum in the map.
            prefixSum.put(sum, prefixSum.getOrDefault(sum,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        System.out.println(countSubArrays(arr,6));
    }
}
