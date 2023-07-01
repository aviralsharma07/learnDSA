/*
- Recursion: It is a phenomenon when a function calls itself indefinitely until a specified condition is fulfilled.
- Whenever recursion calls are executed, they’re simultaneously stored in a recursion stack where they wait for the completion of the recursive function.
- A recursive function can only be completed if a base condition is fulfilled and the control returns to the parent function.
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Recursion {

    static void printReverseArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    static int[] auxilaryArrayMethod(int[] array){
        int n = array.length;
        int[] answer = new int[n];
        for(int i=0; i<n; i++){
            answer[i] = array[n-i-1];
        }
        return answer;
    }

    static void spaceOptimizedIterativeMethod(int[] array){
        int n = array.length;
        int start = 0;
        int end = n-1;
        while (start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++; end--;
        }
        System.out.println();
        printReverseArray(array);
    }

    static void recursiveMethod(int[] array, int start, int end){
        // Base Condition
        if (start > end) {
            System.out.println();
            printReverseArray(array);
            return;
        }
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        recursiveMethod(array,start+1,end-1);
    }

    // MAIN FUNCTION STARTS
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {11,12,13,14,15,16,17,18,19};
        int[] arr3 = {10,20,30,40,50};
        Integer[] arr4 = {7,13,17,19,23,29,31,37,41,43,47,51};
        printReverseArray(auxilaryArrayMethod(arr1));
        spaceOptimizedIterativeMethod(arr2);
        recursiveMethod(arr3,0,arr3.length-1);
        // We can also reverse an array Directly using reverse method from Collections Class in Java.
        // This Method expects an object as argument, so we have to convert array into a list using asList() Method.
        // Java collections require wrapper classes instead of primitive data types. In order to reverse an integer array use Integer instead of int.
        Collections.reverse(Arrays.asList(arr4));
        System.out.println();
        System.out.println(Arrays.toString(arr4));
    }
}
