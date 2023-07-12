import java.util.Arrays;

public class SetMatrixZeroes {

    /*
        Problem Link: https://leetcode.com/problems/set-matrix-zeroes/
        Brute Force Approach: - Iterate through the Array and check if (arr[i][j] == 0)
                              - if element is zero then set all the elements along its row and column as -1 except zeros
                              - Call setRow and setCol Methods
                              - Iterate through the array again and set all -1s with 0s
                              - Time Complexity: O(N*N*N)
                              - Space Complexity: O(1)

        Better Solution: - Initialize two arrays row[n] and col[m] to keep track of all the rows and cols with 0 in them
                         - Traverse the array and if an element (arr[i][j] == 0) -> Set row[i] = 1 AND col[j] = 1
                         - Now Traverse the array again and for element arr[i][j] check if either there is a zero in its row or col
                           i.e., if (row[i] == 1 || col[j] == 1) and set that element to 0 if condition is TRUE
                         - Time Complexity: O(N*M)
                         - Space Complexity: O(N) + O(M)

        Optimal Solution: - Time Complexity: O(N*M)
                          - Space Complexity: O(1)


    */

    static void setMatrixZero(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;

        // row[n] -> matrix[...][0]
        // col[m] -> matrix[0][...]

        int col0 = 1;

        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if (matrix[i][j] == 0){
                    // Mark the Ith Row
                    matrix[i][0] = 0;
                    // Mark the Jth Column
                    if (j != 0) matrix[0][j] = 0;
                    else col0 = 0;
                }
            }
        }

        for (int i=1; i<n; i++){
            for (int j=1; j<m; j++){
                if (matrix[i][j] != 0){
                    // check for row and col
                    if (matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        if (matrix[0][0] == 0){
            for (int j=0; j<m; j++){
                matrix[0][j] = 0;
            }
        }

        if (col0 == 0){
            for (int i=0; i<n; i++){
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { {1,1,1},
                           {1,0,1},
                           {1,1,1}
                         };
        setMatrixZero(matrix);
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

