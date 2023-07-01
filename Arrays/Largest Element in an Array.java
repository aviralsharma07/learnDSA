public class LargestElementInArray {

    // Question Link: https://practice.geeksforgeeks.org/problems/largest-element-in-array4009/1
  
    static int largestNumber(int[] arr, int n) {
        int largestNum = arr[0];
        for (int i=1; i<n; i++){
            if (arr[i] > largestNum) {
                largestNum = arr[i];
            }
        }
        return largestNum;
    }

    public static void main(String[] args) {
        int[] arr = {12,3,45,13,7,9,18,53,17,19};
        System.out.println(largestNumber(arr,arr.length));
    }
}
