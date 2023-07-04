import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateAnArray {


    /*
        Question Link: https://leetcode.com/problems/rotate-array/
        
        Brute Force Solution: - Run an Outer Loop K Times, where each iteration rotates array by one element.
                              - Run an Inner Loop Which shifts every array element by one index for every K rotation.
                              -    for (int i=0; i<k; i++){
                                       int temp = nums[0];
                                       for (int j=0; j<nums.length; j++){
                                             int temp2 = nums[j];
                                             nums[j] = temp;
                                             temp = temp2;
                                       }
                                       nums[0] = temp;
                                   }
                              - Time Complexity: O(N*K)
                              - Space Complexity: O(1)


         Better Solution:  - An array A rotated by x positions results in an array B of the same length
                              such that A[i] == B[(i+x) % A.length], where % is the modulo operation.
                            - Using the above Formula we find the new index of each element after rotation and save them
                              accordingly on that index in a new array.
                            - We then copy elements of this New Rotated Array to Original Array.
                            - Time Complexity: O(N)
                            - Space Complexity: O(N)
                            - static void rotateArrayByK (int[] arr, int k){
                                  int n = arr.length;
                                  int[] nums = new int[n];
                                  for (int i=0; i<n; i++) {
                                      nums[(i+k)%n] = arr[i];
                                  }
                                  for (int i=0; i<n; i++){
                                      arr[i] = nums[i];
                                  }
                             }

        Optimal Solution: - Calculate the effective number of rotations k by taking the remainder of k divided by the length of the array
                            (k = k % nums.length). This step is performed to handle cases where k is greater than the array length, as
                            rotating the array by its length has no effect.
                          - Reverse the entire array. This can be done by swapping the elements from the start and end of the array, moving
                            towards the middle until reaching the middle index.
                          - Reverse the first k elements of the array. This can be done by swapping the elements from the start and end
                            of the subarray [0, k-1], moving towards the middle until reaching the middle index of the subarray.
                          - Reverse the remaining elements of the array, i.e., the elements from index k to the end of the array.
                            This can be done by swapping the elements from the start and end of the subarray [k, nums.length - 1],
                            moving towards the middle until reaching the middle index of the subarray.
                          - The array is now rotated to the right by k steps.
                          - Time Complexity: O(N)
                          - Space Complexity: O(1)

    */



    static void rotateArrayByK(int[] nums, int k) {
        k = k % nums.length;

        reverse(nums, 0, nums.length - 1); // Reverse the entire array
        reverse(nums, 0, k - 1); // Reverse the first k elements
        reverse(nums, k, nums.length - 1); // Reverse the remaining elements
    }

    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.println("Enter K: ");
        int k = in.nextInt();
        System.out.println("Original Array: " + Arrays.toString(arr));
        rotateArrayByK(arr,k);
        System.out.println("Array after Rotation: " + Arrays.toString(arr));
    }
}
