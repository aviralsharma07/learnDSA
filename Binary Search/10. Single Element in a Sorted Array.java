public class SingleElementInASortedArray {

    /*
        Problem Link: https://leetcode.com/problems/single-element-in-a-sorted-array/
        Optimal Solution: (1) If n == 1: This means the array size is 1. If the array contains only one element, we will return that element only.
                          (2) If arr[0] != arr[1]: This means the very first element of the array is the single element. So, we will return arr[0].
                          (3) If arr[n-1] != arr[n-2]: This means the last element of the array is the single element. So, we will return arr[n-1].
                          (4) Place the 2 pointers i.e. low and high: Initially, we will place the pointers excluding index 0 and n-1 like this:
                              low will point to index 1, and high will point to index n-2 i.e. the second last index.
                          (5) Calculate the ‘mid’: Now, inside a loop, we will calculate the value of ‘mid’ using the following formula:
                              mid = (low+high) // 2 ( ‘//’ refers to integer division)
                          (6) Check if arr[mid] is the single element:
                              If arr[mid] != arr[mid-1] and arr[mid] != arr[mid+1]: If this condition is true for arr[mid],
                              we can conclude arr[mid] is the single element. We will return arr[mid].
                          (7) If (mid % 2 == 0 and arr[mid] == arr[mid+1]) or (mid%2 == 1 and arr[mid] == arr[mid-1]):
                              This means we are in the left half and we should eliminate it as our single element appears on the right.
                              So, we will do this: low = mid+1.
                          (8) Otherwise, we are in the right half and we should eliminate it as our single element appears on the left.
                              So, we will do this: high = mid-1.
                           - Time Complexity: O(logN)
                           - Space Complexity: O(1)

    */

    static int singleElement(int[] nums){
        int n = nums.length;

        if (n == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n-1] != nums[n-2]) return nums[n-1];

        int start = 0;
        int end = n - 1;
        while (start <= end){
            int mid = start + (end-start)/2;

            // If mid element has count 1 -> return mid
            if (nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]) return nums[mid];

            // We are in the left part
            if ((mid%2 == 0 && nums[mid] == nums[mid+1]) || (mid%2==1 && nums[mid] == nums[mid-1])){
                start = mid + 1;
            }
            // We are in the right part
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3,3,7,7,10,11,11};
        System.out.println(singleElement(arr));
    }
}
