import java.util.Arrays;

public class MergeSort {

    // Merge Sort: Divide and Merge
    // Time Complexity: O(N*LOG2(n))

    static void mergeArray(int[] arr, int low, int mid, int high){

        // Length of temp array is (h-l+1) because in each recursive step length of combining array is different.
        int[] temp = new int[high - low + 1];
        // index helps to add new traverse and add sorted elements to temp
        int index = 0;
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high){
            if (arr[left] <= arr[right]){
                temp[index] = arr[left];
                left++;
            } else {
                temp[index] = arr[right];
                right++;
            }
            index+=1;
        }
         while (left<=mid){
             temp[index] = arr[left];
             index++;
             left++;
         }
         while (right<=high){
             temp[index] = arr[right];
             index++;
             right++;
         }

         // Copy the Sorted Array i.e., temp to Original Array
         for (int i=low; i<=high; i++){
             arr[i] = temp[i-low];
         }
    }

    static void mergeSort(int[] arr, int low, int high){

        int mid = (low+high)/2;

        // Base Condition
        if (low == high) return;

        // Dividing Left Array
        mergeSort(arr,low,mid);

        // Dividing Right Array
        mergeSort(arr,mid+1,high);

        // Merging Left and Right Arrays
        mergeArray(arr,low,mid,high);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,15,7,11,4};
        mergeSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
