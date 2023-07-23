public class FindPeakElement {
    
    /*
       Problem Link: https://leetcode.com/problems/find-peak-element/
    */
    
    static int fndPeak(int[] nums){
        int n = nums.length;
        
        // Edge cases
        if (n == 1) return 0;
        if (nums[0] > nums[1]) return 0;
        if (nums[n-1] > nums[n-2]) return n-1;
        
        int start = 1;
        int end = n - 2;
        while (start <= end){
            int mid = start + (end-start)/2;
            
            // return mid if it greater than elements to its immediate left and right
            if (nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) return mid;
            
            // if mid is less that element to its left, then we move to left
            else if(nums[mid] < nums[mid-1]){
                end = mid - 1;
            }
            
            // otherwise we move to right
            else {
                start = mid + 1;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,1,3,5,6,4};
        System.out.println(fndPeak(arr));
    }
}
