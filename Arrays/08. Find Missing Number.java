import java.util.Arrays;

public class MissingNumber {

    /*
          Question Link: https://leetcode.com/problems/missing-number/
          
          Brute Force Solution: - Run a Loop for i=0 to i=n-1
                                - For each iteration, perform Linear Search for i
                                - return the i that is not found during Linear Search.
                                - Time Complexity: O(N*N)
                                - Space Complexity: O(1)

          Better Solution 1: - Create a Hash Array of all elements
                             - In Hash Array, if Frequency of an index is 0, return the index.
                             - Time Complexity: O(N)
                             - Space Complexity: O(N)

          Better Solution 2: - Sort the Array
                             - Iterate the Array and if (arr[i] != arr[i-1] + 1) return arr[i]-1 AS answer
                             - Time Complexity: O(NlogN + N)
                             - Space Complexity: O(1)

          Optimal Solution :  - Find the Sum of Numbers from 1 to n
                              - Find the Sum of Elements in Array
                              - Difference of Both the Sum is Missing Element
                              - Time Complexity: O(N)
                              - Space Complexity: O(1)
    */


    static int missingNumber (int[] arr){
        int n = arr.length;
        int sum1 = (n*(n+1))/2;
        int sum2 = 0;
        for (int a: arr){
            sum2 += a;
        }
        return sum1-sum2;
    }


    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(Arrays.toString(arr));
        System.out.println(missingNumber(arr));

    }
}
