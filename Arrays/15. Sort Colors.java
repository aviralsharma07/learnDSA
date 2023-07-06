import java.util.Arrays;

public class SortColors {

    /*
        Question Link: https://leetcode.com/problems/sort-colors/
        Brute Force Solution: - Sort the Array uing Quick Sort
                              - Time Complexity: O(N*logN)
                              - Space Complexity: O(1)

        Better Solution: - First Iteration of Array: Story count of 0,1 and 2 as a,b,c
                         - Second Iteration of Array: Store 0 for count a, 1 for b and 2 for c respectively.
                         - Time Complexity: O(N)
                         - Space Complexity: O(1)

        Optimal Solution: - Use a variation of DUTCH NATIONAL FLAG Algorithm
                          - This Algorithm says that:
                              ~ 0 to low-1 -> All 0s
                              ~ low to mid-1 -> All 1s
                              ~ high to n-1 -> All 2s
                              ~ mid to high-1 -> Random unsorted array of integers 0,1 and 2
                                  >> if (arr[mid] == 0) -> Swap(arr[low],arr[mid]), mid++, low++
                                  >> if (arr[mid] == 1) -> mid++ (Cause array till mid is already Sorted)
                                  >> if (arr[mid] == 2) -> Swap(arr[mid],arr[high]), high--
                          - Time Complexity: O(N)
                          - Space Complexity: O(1)
    */

    static void sortColors(int[] arr){
        int low = 0, mid = 0, high = arr.length-1;
        while (mid <= high){
            if (arr[mid] == 0) {
                swap(arr,low,mid);
                low++; mid++;
            } else if (arr[mid] == 1){
                mid++;
            } else {
                swap(arr,mid,high);
                high--;
            }
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}
