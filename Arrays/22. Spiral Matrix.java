import java.util.ArrayList;
import java.util.Arrays;

public class SpiralMatrix {

    /*
        Problem Link: https://leetcode.com/problems/spiral-matrix/
        Solution: - For an array: arr[n][m], Initialize left = 0, top = 0, right = m-1, bottom = n-1
                  - 1st loop: This will print the elements from left to right. (Increment Top after addition of elements)
                  - 2nd loop: This will print the elements from top to bottom. (Decrement Right after addition of elements)
                  - 3rd loop: This will print the elements from right to left. (Decrement Bottom after addition of elements)
                  - 4th loop: This will print the elements from bottom to top. (Increment Left after addition of elements)
                  - Time Complexity: O(N*M)
                  - Space Complexity: O(N)


    */
    static ArrayList<Integer> spiralMatrix(int[][] arr){
        int left = 0;
        int right = arr[0].length-1;
        int top = 0;
        int bottom = arr.length-1;
        ArrayList<Integer> ans = new ArrayList<>();
        while (left<=right || top<=bottom){

            if (top <= bottom){
                for (int i=left; i<=right; i++){
                    ans.add(arr[top][i]);
                }
                top++;
            }

            if (left <= right){
                for (int i=top; i<=bottom; i++){
                    ans.add(arr[i][right]);
                }
                right--;
            }

            if (top <= bottom){
                for (int i=right; i>=left; i--){
                    ans.add(arr[bottom][i]);
                }
                bottom--;
            }

            if (left <= right){
                for (int i=bottom; i>=top; i--){
                    ans.add(arr[i][left]);
                }
                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[][] arr = {  {1,2,3,4},
//                         {5,6,7,8,},
//                         {9,10,11,12}
//                      };
        int[][] arr = {   {1,2,3},
                          {4,5,6},
                          {7,8,9}
                      };
        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + "        ");
            }
            System.out.println();
        }
        ArrayList<Integer> answer = spiralMatrix(arr);
        System.out.println(answer);
    }
}
