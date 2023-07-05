import java.util.HashMap;

public class LongestSubArrayWithSumK {

    /*
          Question Link: https://takeuforward.org/data-structure/longest-subarray-with-given-sum-k/
          Brute Force Solution: - Calculate length of all sub-arrays starting from each element with sum k
                                - Compare length of current sub-array with maximum length.
                                - if (currentLength > maxLength) -> Set maxLength = currentLength
                                - int maxLength = 0;
                                  for (int i=0; i<n; i++){
                                      int j = i;
                                      int currentLength = 0, sum = 0;
                                      while (sum<k && j<n){
                                             sum += arr[j];
                                             ++currentLength;
                                             ++j;
                                      }
                                      if (currentLength > maxLength){
                                      maxLength = currentLength;
                                      }
                                   }
                                   return maxLength;
                                - Time Complexity: O(N*N)
                                - Space Complexity: O(1)


         Better Solution: - Hashing
                          - Time Complexity: O(N)
                          - Space Complexity: O(N)

         Optimal Solution: Two Pointers
                          - Time Complexity:O(N)
                          - Space Complexity:

    */


    static int longestSubArray(int[] arr, int k){
        int n = arr.length;
        HashMap<Integer,Integer> prefixSum = new HashMap<>();
        int maxLength = 0;
        int sum = 0;
        for (int i=0; i<n; i++){
            sum += arr[i];
            if (sum == k){
                maxLength = Math.max(maxLength,i+1);
            }
            int rem = sum - k;
            if (prefixSum.containsKey(rem)){
                int len = i - prefixSum.get(rem);
                maxLength = Math.max(maxLength,len);
            }
            if(!prefixSum.containsKey(sum)){
                prefixSum.put(sum,i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {10,2,5,7,1,9};
        int k = 15;
        System.out.println(longestSubArray(arr,k));
    }
}
