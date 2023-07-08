import java.util.HashMap;

public class MajorityElement {

    /*
        Question Link: https://leetcode.com/problems/majority-element/
        Brute Force Solution: - Run Two Loops
                              - Outer Loop Pick each element in every iteration from i to n-1
                              - Inner Loop counts the frequency of each selected element by outer Loop
                              - if frequency > n -> return the element i.e arr[i]
                              - Time Complexity: O(N*N)
                              - Space Complexity: O(1)

        Better Solution: - Store the elements and its Frequency in a HashMap with key as element and its count in the array as value
                         - Iterate over HashMap to find the key with Value > n
                         - Store this key and return as answer
                         - Time Complexity: O(N + N*logN)
                         - Space Complexity: O(N)

        Optimal Solution: - Moore's Voting Algorithm
                          - Initialize Count and element
                                 ~ Count: To count the frequency of element
                                 ~ element: To store the selected element for which we are counting
                          - Traverse the Array from i to n-1 and do the following:
                                 ~ If (count == 0) -> Set count = 1 AND element = arr[i]
                                 ~ else If (element = arr[i]) -> Increment count by 1 i.e., count++
                                 ~ else Decrement count by 1 i.e., count--
                          - The value of element at last will be the Majority Element
                          - Time Complexity: O(N)
                          - Space Complexity: O(1)
                                 
    */


    static int majorityElement(int[] nums){
        int n = (nums.length)/2;
        int count = 0;
        int element = Integer.MIN_VALUE;
        for (int i=0; i<n; i++){
            if (count == 0){
                count = 1;
                element = nums[i];
            } else if (element == nums[i]) {
                count++;
            }else {
                count--;
            }
        }
        return element;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(majorityElement(arr));
    }
}
