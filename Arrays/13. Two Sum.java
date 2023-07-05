import java.util.*;

public class twoSum {


    /*
         Problem Link: https://leetcode.com/problems/two-sum/
         
         Brute Force Solution: - Run a Outer Loop for i=0 to n-1
                               - RUn an inner Loop for each iteration of Outer Loop for j=i+1 to n
                               - If(arr[i] + arr[j] == target) -> store index of i and j, Break out from Both Loops
                               - Return the answer array with element indexes.
                               - Time Complexity: O(N)
                               - Space Complexity: O(1)

         Better Solution: - Use of Hashing: Hash Table of HashMap
                          - Store the Elements in a Map.
                          - Iterate through each element of array and find its complement = target - arr[i]
                          - if map contains the complement of current element -> add its index to answer array.
                          - By the end of Loop we shall have index of both the elements.
                          - Time Complexity: O(N)
                          - Space Complexity: O(N)
    */


    static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<n; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for (int i=0; i<n; i++){
            if (map.containsKey(target-nums[i])){
                if (ans[0] != -1){
                    ans[1] = i;
                }else {
                    ans[0] = i;
                }
            }
        }
      
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {2,11,7,15,8};
        System.out.print("Enter Target Value: ");
        int target = in.nextInt();
        int[] answer = twoSum(arr,target);
        System.out.println(Arrays.toString(answer));

    }
}
