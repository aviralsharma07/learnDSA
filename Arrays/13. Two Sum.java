import java.util.*;

public class twoSum {


    /*
         Problem Link: https://leetcode.com/problems/two-sum/
         Brute Force Solution: - Run a Outer Loop for i=0 to n-1
                               - Run an inner Loop for each iteration of the Outer Loop for j=i+1 to n
                               - If(arr[i] + arr[j] == target) -> store index of i and j, Break out from Both Loops
                               - Return the answer array with element indexes.
                               - Time Complexity: O(N)
                               - Space Complexity: O(1)

         Better Solution: - Use of Hashing: Hash Table of HashMap
                          - Iterate through the Array and check if target - arr[i] exists in the map yet
                          - if map contains (target-arr[i]) -> result[1] = i and result[0] -> index of target - arr[i] (stored in the map)
                          - Insert the new element in the map -> map.put(arr[i],i)
                          - By the end of Loop we shall have an index of both elements.
                          - Time Complexity: O(N)
                          - Space Complexity: O(N)
    */


    static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i=0; i< n; i++){
            if (map.containsKey(target-nums[i])){
                result[1] = i;
                result[0] = map.get(target-nums[i]);
            }
            map.put(nums[i],i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {3,2,4};
        System.out.print("Enter Target Value: ");
        int target = in.nextInt();
        int[] answer = twoSum(arr,target);
        System.out.println(Arrays.toString(answer));
    }
}
