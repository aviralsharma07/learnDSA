import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    // Insertion Sort: Takes an element and places it at its correct position.
    // Time Complexity: O(N^2) for Worst and Average Case
    //                : O(N) for Best Case -> This will happen when no SWAP happen in the first iteration itself.


    static void insertionSort(int[] arr, int n){
        for (int i=0; i<n; i++){
            int j = i;
            while (j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input number of elements in array from the user
        System.out.println("Enter the Number of elements in the Array: ");
        int n = in.nextInt();

        // Initialise the array and input its elements from the user.
        int[] arr = new int[n];
        System.out.println("Enter Array Elements");
        for (int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        // Call the Insertion Sort Function on the array and print the sorted array.
        insertionSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}
