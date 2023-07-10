import java.util.Arrays;

public class NextPermutation {

    /*
        Question Link: https://leetcode.com/problems/next-permutation/
        Optimal Solution: (1) Find the break-point:
                                   - i: Break-point means the first index i from the back of the given array
                                     where arr[i] becomes smaller than arr[i+1].
                                   - For example, if the given array is {2,1,5,4,3,0,0}, the break-point will be index 1(0-based indexing).
                                     Here from the back of the array, index 1 is the first index where arr[1] i.e.
                                     1 is smaller than arr[i+1] i.e. 5.
                                   - To find the break-point, using a loop we will traverse the array backward and store the index i
                                     where arr[i] is less than the value at index (i+1) i.e. arr[i+1].

                          (2) If such a break-point does not exist i.e.
                                   - if the array is sorted in decreasing order, the given permutation is the last one in the sorted order
                                     of all possible permutations. So, the next permutation must be the first i.e. the permutation in increasing order.
                                   - So, in this case, we will reverse the whole array and will return it as our answer.

                          (3) If a break-point exists:
                                   - Find the smallest number i.e. > arr[i] and in the right half of index i
                                     (i.e. from index i+1 to n-1) and swap it with arr[i].
                                   - Reverse the entire right half(i.e. from index i+1 to n-1) of index i.
                                     And finally, return the array.

                           (4) - Time Complexity: O(3*N)
                               - Space Complexity: O(1)
    */

    static void reverseArray(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void nextPermutation(int[] nums){
        int n = nums.length;

        int index = -1;
        for (int i=n-2; i>=0; i--){
            if (nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }

        if (index == -1){
            reverseArray(nums, 0,n-1);
            return;
        }

        for (int i=n-1; i>index; i--) {
            if (nums[i] > nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }

        reverseArray(nums,index+1,n-1);
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}

