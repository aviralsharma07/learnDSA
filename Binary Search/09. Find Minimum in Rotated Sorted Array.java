class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        int ans = Integer.MAX_VALUE;
        while (start <= end){
            int mid = start + (end-start)/2;

            // Check if the array is already sorted and return the element at low as min 
            if (nums[start] < nums[end]){
                ans = Math.min(ans,nums[start]);
                break;
            }
            // If Left part is sorted
            if (nums[start] <= nums[mid]){
                ans = Math.min(ans,nums[start]);
                start = mid + 1;
            }
            // Otherwise if right part is sorted
            else{
                ans = Math.min(ans,nums[mid]);
                end = mid - 1;
            }
        }
        return ans;
    }
}
