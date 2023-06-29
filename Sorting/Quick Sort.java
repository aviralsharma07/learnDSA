import java.util.Arrays;

public class QuickSort {

    // Quick Sort(Divide and Conquer Algorithm): 1. Pick a Pivot and Put it in its right place in the sorted array.
    //                                           2. Smaller on the left, Larger on the right.
    // Time Complexity: O(N*Log(N))
    // Space Complexity: O(1)


    static int placePivot(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low, j = high;
        while (i<j) {
            while (arr[i] <= pivot && i <= high-1) {
                ++i;
            }
            while (arr[j] > pivot && j >= low+1) {
                --j;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[low] = arr[j];
        arr[j] = pivot;
        return j;
    }

    static void quickSort(int[] arr, int low, int high){
        if (low < high){
            int partitionIndex = placePivot(arr,low,high);
            quickSort(arr,low,partitionIndex-1);
            quickSort(arr,partitionIndex+1,high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
