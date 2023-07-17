import java.util.Arrays;

public class FirstAndLastElement {

    /*
         Problem Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    */

    static int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1};
        ans[0] = firstIndex(nums,target);
        ans[1] = lastIndex(nums,target);
        return ans;
    }

    static int firstIndex(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int ans0 = -1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (nums[mid] < target){
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                ans0 = mid;
                end = mid - 1;
                start = 0;
            }
        }
        return ans0;
    }

    static int lastIndex(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int ans1 = -1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (nums[mid] < target){
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                ans1 = mid;
                end = nums.length - 1;
                start = mid + 1;
            }
        }
        return ans1;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int[] answer = searchRange(arr,target);
        System.out.println(Arrays.toString(answer));
    }
}
