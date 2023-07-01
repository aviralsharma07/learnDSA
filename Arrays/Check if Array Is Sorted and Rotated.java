import java.util.Arrays;

public class SortedAndRotatedArray {

    /*

        Question Link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
    
        Brute Force Solution: - Find supposed Pivot Element
                          - Rotate the Array around Pivot
                          -  If the Rotated Array is Sorted return true, else return false
                          - Time Complexity: O(N)
                          - Space Complexity: O(N)

        Optimal Solution: - (i) The First Element Of Every Sorted Rotated Array Will Always Be Either Greater Than or Equal
                                to The Last Element Of The Array.

                                For Example :-
                                    int arr[]={3,4,5,1,2}; {Rotated 3 Times}
                                    int arr[]={1,1,1}; {Rotated 0 Times}

                            (ii) Two Paramount Cases To Take Care Of :-

                                    (1) If The Array is Sorted and Rotated 0 Times, i.e., Entire Array Is Sorted ->
                                    The Value Of Flag Will Always Be 0 and We Can Return True Without Bothering
                                    Ourselves With Checking For Any Other Condition.

                                    (2) If The Array is Sorted and Rotated K Times, The Value of Flag Will Strictly Be 1
                                    By The End Of The Array Traversal and We Must Only Return True Iff Value of Flag is 1 and The
                                    First Element Of The Array Is Either Greater Than or Equal To The Last Element Of The Array.
                         - Time Complexity: O(N)
                         - Space Complexity: O(1)

    */

    static boolean sortedAndRotated(int[] nums, int n) {

//        // Finding Pivot
//        int pivot = 0;
//        for (int i=1; i<n; i++ ){
//            if (arr[i] < arr[i-1]) {
//                pivot = 3;
//                break;
//            }
//        }
//
//        // Finding Actual Rotated Array
//        int[] nums = new int[n];
//        for (int i=0; i<n; i++){
//            nums[i] = arr[(i+pivot)%n];
//        }
//
//        // Checking id Rotated Array is Sorted or Not
//        boolean answer = true;
//        for (int i=1; i<n; i++){
//            if (nums[i] < nums[i-1]){
//                return false;
//            }
//        }
//        return true;

        int length = nums.length;
        boolean flag1 = false;
        int flag=0;
        if(nums[0] >= nums[nums.length-1])
        {
            flag1=true;
        }
        for(int i=0;i<length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                flag++;
            }
        }
        if(flag1 == true && flag==1 || flag==0)
        {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(sortedAndRotated(arr, arr.length));
    }
}
