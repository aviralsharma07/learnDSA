public class SearchInRotatedSortedArray {

    /*
        Question Link: https://leetcode.com/problems/search-in-rotated-sorted-array/
        Brute Force Solution: - Iterate Array Linearly and return the index of Target
                              - Time Complexity: O(N)
                              - Space Complexity: O(1)

        Optimal Solution: (1) Place the 2 pointers i.e. low and high: Initially, we will place the pointers like this:
                            low will point to the first index, and high will point to the last index.
                            
                          (2) Calculate the ‘mid’: Now, inside a loop, we will calculate the value of ‘mid’ using the following formula:
                            mid = (low+high) // 2 ( ‘//’ refers to integer division)
                            
                          (3) Check if arr[mid] == target: If it is, return the index mid.
                          
                          (4) Identify the sorted half, check where the target is located, and then eliminate one half accordingly:
                              ~ If arr[low] <= arr[mid]: This condition ensures that the left part is sorted.
                                     ## If arr[low] <= target && target <= arr[mid]: It signifies that the target is in this sorted half.
                                        So, we will eliminate the right half (high = mid-1).
                                     ## Otherwise, the target does not exist in the sorted half. So, we will eliminate this left half by doing low = mid+1.
                              ~ Otherwise, if the right half is sorted:
                                     ## If arr[mid] <= target && target <= arr[high]: It signifies that the target is in this sorted right half.
                                        So, we will eliminate the left half (low = mid+1).
                                     ## Otherwise, the target does not exist in this sorted half. So, we will eliminate this right half by doing high = mid-1.
                                     
                          (5) Once, the ‘mid’ points to the target, the index will be returned.
                          
                          (6) This process will be inside a loop and the loop will continue until low crosses high. If no index is found, we will return -1.
                          
                          - Time Complexity: O(logN)
                          - Space Complexity: O(1)
    */

    static int searchIndex(int[] nums, int target){
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        // Binary Search Starts
        while (start <= end){

            int mid = start + (end-start)/2;

            // return mid if it is equal to target
            if (nums[mid] == target) return mid;

            // Check if Left part to mid is sorted
            else if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target <= nums[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[end]){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(searchIndex(arr,target));
    }
}
