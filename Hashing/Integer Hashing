/*
Hashing: Prestoring and Fetching
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Recursion {

    // MAIN FUNCTION STARTS
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,4,6,4,7,7,3,5,1,11,8};

        // Precompute
        int[] hash = new int[12];
        for (int i=0; i< arr.length; i++){
            hash[arr[i]] += 1;
        }

        // Fetch
        for (int i=0; i<12; i++){
            System.out.println("Count of "+i+" in arr is: "+hash[i]);
        }
    }
}
