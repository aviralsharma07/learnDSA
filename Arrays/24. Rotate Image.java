public class RotateImage {

    /*
        Problem Link: https://leetcode.com/problems/rotate-image/
        Brute Force Solution: - Create another answer array and store elements to their right position in this ans array
                              - for every element ans[j][n-i-1] = arr[i][j]
                              - Time Complexity: O(N*M)
                              - Space Complexity: O(N*M)

        Optimal Solution: - Transpose the Matrix: Iterate All the matrix elements for which J>I
                          - Swap arr[i][j] AND arr[j][i]
                          - Reverse every Row of matrix
                          - Time Complexity: O((N/2)*(M/2) + N*(M/2))
                          - Space Complexity: O(1)
    */

    static void rotateArray(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] ans = new int[n][m];
        for (int i=0; i<n; i++){
            for (int j=i+1; j<m; j++){
                    int temp = matrix[j][i];
                    matrix[j][i] = matrix[i][j];
                    matrix[i][j] = temp;
            }
        }
        for (int[] ints : matrix) {
            reverseArray(ints);
        }
    }

    static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++; end--;
        }
    }

    public static void main(String[] args) {
        int[][] arr = { {1,2,3}, {4,5,6}, {7,8,9} };
        rotateArray(arr);
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
