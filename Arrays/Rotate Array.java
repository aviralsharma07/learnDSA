import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateAnArray {


    /*
        Brute Force Solution: - Run an Outer Loop K Times, where each iteration rotates array by one element.
                              - Run an Inner Loop Which shift every element of array by one index for every single of K rotations.
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


         Optimal Solution:  - An array A rotated by x positions results in an array B of the same length
                              such that A[i] == B[(i+x) % A.length], where % is the modulo operation.
                            - Using the above Formula we find the new index of each element after rotation and save them
                              accordingly on that index in new array.
                            - We then copy elements of this New Rotated Array to Original Array.
                            - Time Complexity: O(N)
                            - Space Complexity: O(N)
    */

    static void rotateArrayByK (int[] arr, int k){
        int n = arr.length;
        int[] nums = new int[n];
        for (int i=0; i<n; i++) {
            nums[(i+k)%n] = arr[i];
        }
        for (int i=0; i<n; i++){
            arr[i] = nums[i];
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
