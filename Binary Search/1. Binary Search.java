import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    /*
         Problem Link: https://leetcode.com/problems/binary-search/
         Optimal Solution: - Sort the Array
                           - Initialize start = 0 AND end = n - 1
                           - Run a Loop until (start <= end) and do the following:
                                 ~ Initialize mid = start + end / 2 in every iteration
                                 ~ Compare element at middle with given target element:
                                    # if (array[i] == target) -> return mid i.e., we have found our element.
                                    # else if (array[i] < target) -> start = mid + 1 i.e., target lies at right of mid.
                                    # else end = mid - 1 i.e., target lies at the left of mid.
                           - Time Complexity: O(LogN) [Without Sorting]
                           - Space Complexity: O(1)
    */

    static int binarySearch(int[] arr, int target){
        Arrays.sort(arr);
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start <= end){
            int mid = start + (end - start)/2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {2,7,21,4,23,12,11,89,64,6,43,69};
        System.out.print("Enter Target: ");
        int target = in.nextInt();
        System.out.println(binarySearch(nums,target));
        System.out.println(Arrays.toString(nums));
    }
    
}
