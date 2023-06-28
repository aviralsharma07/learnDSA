import java.sql.SQLOutput;
import java.util.*;

public class Solution {

// ITERATION  |  SORTED ARRAY  |  UNSORTED ARRAY     |
// ---------------------------------------------------
// i=0,j=1:   |  []            |  2,1,3,5,11,6       |
// i=1,j=2:   |  1,            |  2,3,5,11,6         |
// i=2,j=3:   |  1,2           |  3,5,11,6           |
// i=3,j=4:   |  1,2,3         |  5,11,6             |
// i=4,j=5:   |  1,2,3,5       |  11,6               |
// i=5,j=6    |  1,2,3,5,6,11  |  []                 | -> LOOP ENDS HERE

    static void selectionSort(int[] arr){

        // Outer Loop to bring the smallest element in the Unsorted Array to the Sorted Array
        for (int i=0; i< arr.length-1; i++){

            int minIndex = i; // index of assumed Minimum Element

            // Inner Loop to iterate through Unsorted Array and find the Smallest Element by comparing every element to the
            // assumed value of minimum element and changing the value of minElement and minIndex as smaller values are encountered
            for (int j=i+1; j< arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            // Swapping Values at first Index of Unsorted Array and index with Minimum Element to add next element to Sorted Array.
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Enter Number of Elements in Array
        System.out.println("Enter Number of Elements in Array: ");
        int n = in.nextInt();

        // Initialise an Array and take Values from User
        int[] arr = new int[n];
        System.out.println("Enter all the Array Elements: ");
        for (int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        // Call the Selection Sort Method and pass array to be Sorted to the Method.
        selectionSort(arr);

        // Print the Sorted Array
        System.out.println(Arrays.toString(arr));
    }
}

