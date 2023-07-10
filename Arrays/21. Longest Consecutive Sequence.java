import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {

    /*
          Problem Link: https://leetcode.com/problems/longest-consecutive-sequence/description/
          Brute Force Solution: - Sort the Array
                                - Initialize maxLength and currLength to 1
                                - Run a Loop from 1 to n-1 such that:
                                   ~ if (arr[i] == arr[i+1]) -> currentLength + 1
                                   ~ else if (arr[i] == arr[i-1]) -> continue;
                                   ~ else set currentLength = 1 again to find length of new Sub Sequence
                                   ~ After This if (currLength > maxLength) -> max = curr;
                                -  Time Complexity: O(N + N*logN)
                                -  Space Complexity: O(1)

         Optimal Solution: - Using HashSet
                           - Store the elements in HashMap.
                           - Iterate through element of array. i: 0 to n
                           - Set currNum = arr[i]
                           - If (Hashmap does not contains arr[i] - 1) -> this means arr[i] must be the last element of a Sub-sequence
                           - Thus Iterate the Hashmap such that if(map contains currNum+1) -> increase the current count of sub-sequence
                             and increment currNum to check if next consecutive element exist.
                           - After Finding currLength i.e, length of current sequence compare it with max length and store the max of two in maxLength
                           - After iteration for all arr elements return maxLength
                           - Time Complexity: O(N)
                           - Space Complexity: O(1)
    */

    static  int longestSequence(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int a: arr){
            set.add(a);
        }
        System.out.println("Set: "+set);

        int maxLength = 0;
        for (int num: arr){
            if (!set.contains(num-1)){
                int currNum = num;
                int currLength = 1;

                while(set.contains(currNum + 1)){
                    currNum += 1;
                    currLength += 1;
                }

                maxLength = Math.max(maxLength,currLength);
            }
        }
        return maxLength;
     }

    public static void main(String[] args) {
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        System.out.println("Max Length: "+longestSequence(arr));
    }
}

