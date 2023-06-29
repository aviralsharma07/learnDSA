import java.util.Arrays;

public class QuickSort {

    // Quick Sort(Divide and Conquer Algorithm): 1. Pick a Pivot and Put it in its right place in the sorted array.
    //                                           2. Smaller on the left, Larger on the right.
    // Time Complexity: O(N*Log(N))
    // Space Complexity: O(1)


//    static int partition(int[] arr, int low, int high){
          // This Function uses High as Pivot
//        int pivot = arr[high];
//        int i = low - 1;
//        for (int j=low; j<high; j++){
//            if (arr[j] < pivot){
//                i++;
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//        i++;
//        int temp = arr[i];
//        arr[i] = pivot;
//        arr[high] = temp;
//        return i;
//    }


    static int partition(int[] arr, int low, int high){
        // This Function uses Low as Pivot
        int pivot = arr[low];
        int i = high + 1;
        for (int j=high; j>0; j--){
            if (arr[j] > pivot){
                i--;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i--;
        int temp = arr[i];
        arr[i] = pivot;
        arr[low] = temp;
        return i;
    }

    
    static void quickSort(int[] arr, int low, int high){
        if (low < high){
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
