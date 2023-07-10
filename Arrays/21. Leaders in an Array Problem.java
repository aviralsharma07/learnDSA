import java.util.ArrayList;
import java.util.Collections;

public class LeadersInAnArray {

    /*
         Problem Link: https://www.codingninjas.com/studio/problems/superior-elements_6783446
         Brute Force Solution: - Use Nested Loops
                               -  For Every Element i to n-1 Check if it is Leader one by one
                               - Outer Loop to Choose element and iterate array
                               - Inner Loop to check if it is leader
                               - Time Complexity: O(N*N)
                               - Space Complexity: O(N)

         Optimal Solution: - Start from the Right of Array and set max = arr[n-1]
                           - Iterate from n-2 to 0 and do the following:
                               ~ if(arr[i] > max) -> It is a Leader, Add it to answer List
                               ~ Set max = arr[i]
                           - Time Complexity: O(N)
                           - Space Complexity: O(N)
    */

    static ArrayList<Integer> findLeaders(int[] arr, int n){
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[n-1];
        ans.add(arr[n-1]);
        for (int i=n-2; i>=0; i--){
            if (arr[i] > max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,1};
        System.out.println(findLeaders(arr,arr.length));
    }
}
