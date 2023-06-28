import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    // Bubble Sort: Pushing the Maximum Element to the Right using adjacent Swapping
    // Time Complexity: O(N^2) for Worst and Average Case
    //                : O(N) for Best Case -> This will happen when no SWAP happen in the first iteration itself.

    static void bubbleSort(int[] arr, int n){
        // Checks if Swapping did not happen in the first iteration or Not
        int didSwap = 0;

        // Outer Loop Pushed the Maximum Element in the Sorted Array to the Right.
        for (int i=n-1; i>0; i--){

            // Inner Loop compares every adjacent pair of elements in the Unsorted array to find max at rightmost.
            for (int j=0; j<i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }

            // If Swapping did not happen at all in the first iteration, then the array is already Sorted.
            if (didSwap == 0){
                break;
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

        // Call the Bubble Sort Function on the array and print the sorted array.
        bubbleSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}
