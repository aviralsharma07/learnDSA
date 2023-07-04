import java.util.Arrays;

public class MoveZeroes {

    /*
         Question Link: https://leetcode.com/problems/move-zeroes/
         
         Brute Force Solution: - Take a new Array
                               - Iterate through Original Array and add all non-zero elements to new array.
                               - Return the New Array
                               - Time Complexity: O(N)
                               - Space Complexity: O(N) -> A New Array is Created

         Better Solution: - Run an Outer Loop s.t if (nums[i]==0) -> Iterate elements from i+1 to n
                          - Find the index of first zero in conditional for loop
                          - Swap Elements at i and j i.e., non-zero(i) and zero(j) element
                          - Time Complexity: O(N*N)
                          - Space Complexity: O(1)

         Optimal Solution: - Take two Pointers j and i.
                           - Iterate through array and set j to index where first zero appears
                           - Now Iterate through array from i = j+1, while doing these two things in each iteration:
                               -- if(nums[i]!=0) -> swap(nums[i],nums[j])
                               -- Now the current j is pointing a non-zero element after swap. so we will increment it by 1.
                           - Finally Our array will be set in desired order.
                           - Time Complexity: O(N)
                           - Space Complexity: O(1)
    */


    static void moveZeroes(int[] nums){
        int n = nums.length;
        
        // Initialize Pointer i and j
        int i = 0; // Point to index of non-zero element
        int j=0; // Point to index of zero element
        
        // Set j to First zero index in array.
        for (j=0; j<n; j++){
            if (nums[j] == 0){
                break;
            }
        }
        
        for (i=j+1; i<n; i++){
            if (nums[i] != 0){
                // Swap element at index i and j
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                // increment j
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,3,0,0,12,7,0};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
