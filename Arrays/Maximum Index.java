import java.util.Arrays;

public class MaximumIndex {

    /*
        Brute Force Solution: - Initialize max = 0 and Run an Outer Loop for every Element
                              - Run an Inner Loop from j=i+1.
                              - Check the given constraint AND if (j-1) > Max
                              - return final value of Max.
                              - Time Complexity: O(N*N)
                              - Space Complexity: O(1)

        Optimal Solution: - We create two new arrays, leftMin and rightMax, with the same size as the original
                            array. These arrays will help us keep track of the minimum number on the left side
                            and the maximum number on the right side of each element in the array.
                          - We start from the left side of the array and fill the leftMin array. For each position,
                            we store the minimum number from the beginning of the array up to that position.
                          - Similarly, we start from the right side of the array and fill the rightMax array. For each position,
                           we store the maximum number from that position to the end of the array.
                          - Now, we have two arrays that give us the minimum number on the left and the maximum number on the right
                            for each element in the original array.
                          - We initialize two pointers, i and j, to the first position of the arrays. We compare the minimum number
                            at position i with the maximum number at position j. If the minimum number is less than or equal to the maximum number,
                            it means we have found a valid pair (i, j). We calculate the difference between j and i and update the maximum difference
                            if needed. Then, we move the j pointer to the next position.
                          - If the minimum number is greater than the maximum number, it means the current pair is not valid,
                            and we need to move the i pointer to the next position.
                          - We continue this process until we reach the end of the arrays. Finally, we return the maximum difference we found.
                          - Time Complexity: O(N)
                          - Space Complexity: O(N)

                         
    */

    static int maxIndexDiff(int[] arr, int n) {

            int[] leftMin = new int[n];
            int[] rightMax = new int[n];

            leftMin[0] = arr[0];
            for (int i = 1; i < n; i++) {
                leftMin[i] = Math.min(arr[i], leftMin[i - 1]);
            }

            rightMax[n - 1] = arr[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
            }

            int i = 0, j = 0;
            int maxDiff = -1;

            while (i < n && j < n) {
                if (leftMin[i] <= rightMax[j]) {
                    maxDiff = Math.max(maxDiff, j - i);
                    j++;
                } else {
                    i++;
                }
            }

            return maxDiff;
    }

    public static void main(String[] args) {
        int[] arr = {18,17};
        int ans = maxIndexDiff(arr,arr.length);
        System.out.println(ans);

    }
}
