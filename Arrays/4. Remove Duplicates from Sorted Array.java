import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class RemoveDuplicates {


    /*
    Question Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    
           Brute Force Solution: - Create a Set called uniqueSet to store unique elements.
                                 - Initialize a variable k to keep track of the number of unique elements.
                                 - Iterate over each element num in the nums array.
                                 - Check if num is not present in the uniqueSet.
                                 - If num is not present, it is a unique element. Add it to the nums array at index k, and increment k.
                                 - Add num to the uniqueSet.
                                 - After the iteration, the nums array will contain the unique elements in the order they appeared.
                                 - Return k, which represents the number of unique elements in nums.
                                 - Time Complexity: O(n)
                                 - Space Complexity: O(k), k = number of unique elements.


           Optimal Solution: - Initialize n as the length of the nums array.
                             - Initialize i as 0, which represents the index of the last unique element found.
                             - Iterate j from 0 to n-1.
                             - If nums[i] is not equal to nums[j]:
                                   > Assign nums[j] to nums[i+1] to update the next position with the new unique element.
                                   > Increment i by 1.
                             - Return i+1, which represents the number of unique elements.
                             - Time Complexity: O(n)
                             - Space Complexity: O(1)


    */

    static int removeDuplicates(int[] nums) {
        int n = nums.length;

//        Set<Integer> uniqueSet = new HashSet<>();
//        int k = 0;  // Number of unique elements
//
//        for (int num : nums) {
//            if (!uniqueSet.contains(num)) {
//                nums[k++] = num;
//                uniqueSet.add(num);
//            }
//        }
//
//        return k;

        int i=0;
        for (int j=0; j<n; j++){
            if (nums[i] != nums[j]) {
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
}
