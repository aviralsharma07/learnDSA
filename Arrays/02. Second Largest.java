import java.util.Arrays;

public class SecondLargest {

  /*
    Question Link: https://practice.geeksforgeeks.org/problems/second-largest3735/1


    (1) Brute Force Solution: - Sort the Array
                              - Iterate array from n-2 until arr[i]!=arr[n-1]
                              - When the above condition is met we have our Second-Largest Element
                              - Time Complexity: O(N*logN + N)
                              - Space Complexity: O(1)

    (2) Better Solution: - Find the Largest Element through First Pass.
                         - Initialize largest2nd=-1 and Iterate array from i=0 to n-1
                         - if (arr[i] >  largest2nd AND arr[i] != largest) -> largest2nd = arr[i];
                         - Time Complexity: O(2*N), Two-pass solution
                         - Space Complexity: O(1)

    (3) Optimal Solution: - Initialize the largest and 2nd-largest
                          - Iterate array from i t0 n-1
                          - if (arr[i] > largest) -> 2nd-largest = largest, largest = arr[i]
                          - if (arr[i] > second-largest AND arr[i] != largest) -> 2nd-largest = arr[i]
                          - Time Complexity: O(N), Single-pass solution
                          - Space Complexity: O(1)
  */                        

    // Function to find 2nd Largest Number in an Array
    static int largest2ndNumber(int[] arr, int n) {
        if (n < 2) return -1;
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        for (int i=0; i<n; i++){
            if (arr[i] > large){
                secondLarge = large;
                large = arr[i];
            } else if (arr[i] > secondLarge && arr[i] != large) {
                secondLarge = arr[i];
            }

        }
        if (secondLarge == Integer.MIN_VALUE) return -1;
        return secondLarge;
    }

    // Function to find 2nd Smallest Number in an Array
    static int smallest2ndNumber(int[] arr, int n) {
        if (n < 2) return -1;
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        for (int i=0; i<n; i++){
            if (arr[i] < small){
                secondSmall = small;
                small = arr[i];
            } else if (arr[i] < secondSmall && arr[i] != small) {
                secondSmall = arr[i];
            }

        }
        if (secondSmall == Integer.MAX_VALUE) return -1;
        return secondSmall;
    }

    public static void main(String[] args) {
        int[] arr = {12,3,45,13,7,9,18,53,17,19};
        int[] nums = {642 ,642 ,642 ,642 ,642 ,642 ,642 ,642 ,642 ,642 ,642 ,642 ,642 ,642 ,642 ,642 ,642 ,642 ,642,642,642};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("2nd Largest Number in the Array is: " + largest2ndNumber(arr,arr.length));
        System.out.println("2nd Smallest Number in the Array is: " + smallest2ndNumber(arr, arr.length));
        System.out.println(Arrays.toString(nums));
        System.out.println("2nd Largest Number in the Array is: " + largest2ndNumber(nums,nums.length));
        System.out.println("2nd Smallest Number in the Array is: " + smallest2ndNumber(nums, nums.length));
    }
}
