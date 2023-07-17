import java.util.Arrays;

public class NumberOfOccurences {

  /* 
      Problem Link: https://www.codingninjas.com/studio/problems/occurrence-of-x-in-a-sorted-array_630456
  */

    static int frequency(int[] nums, int target){
        int[] ans = {-1,-1};
        ans[0] = firstIndex(nums,target);
        ans[1] = lastIndex(nums,target);
        if (ans[1]-ans[0]+1 < 0) return 0;
        return ans[1]-ans[0]+1;
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
        System.out.println("ans0: "+ans0);
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
        System.out.println("ans1:"+ans1);
        return ans1;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,4,4,5};
        int target = 6;
        int answer = frequency(arr,target);
        System.out.println(answer);
    }
}
