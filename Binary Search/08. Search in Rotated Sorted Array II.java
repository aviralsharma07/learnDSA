public class SearchInRotatedSortedArrayII {

    /*
        Question Link: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/\
        
        Check if arr[low] = arr[mid] = arr[high]: If this condition is satisfied,
        we will just increment the low pointer and decrement the high pointer by one step.
        We will not perform the later steps until this condition is no longer satisfied.
        So, we will continue to the next iteration from this step.
    */


    static boolean searchIndex(int[] nums, int target){
        int start = 0;
        int end = nums.length;
        while (start <= end){
            int mid = start + (end-start)/2;
            if (nums[mid] ==  target) return true;
            if (nums[start] == target && nums[end] == target){
                start += 1;
                end -= 1;
                continue;
            } else if(nums[start] <= nums[mid]){
                if (nums[start] <= target && target <= nums[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else {
                if (nums[mid] <- target && target <= nums[end]){
                    start =  mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        int target = 3;
        System.out.println(searchIndex(arr,target));
    }
}
