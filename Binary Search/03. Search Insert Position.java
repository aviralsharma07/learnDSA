public class SearchInsertPosition {

    /*
        Problem Link: https://leetcode.com/problems/search-insert-position/
        Optimal Solution: - Use Binary Search
                          - Return the start variable as answer
                          - Time Complexity: O(LogN)
                          - Space Complexity: O(1)
    */

    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid =  start + (end-start)/2;
            if (nums[mid] < target){
                start = mid + 1;
            }else if (nums[mid] > target){
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,7,11,17,21};
        int target = 14;
        System.out.println("Insert Position of Target: " + searchInsert(arr,target));
    }
}
