/*
Given an array A[] of N positive integers which can contain integers from 1 to P where elements can be
repeated or can be absent from the array. Your task is to count the frequency of all elements from 1 to N.
Note: The elements greater than N in the array can be ignored for counting and do modify the array in-place.

You don't need to read input or print anything. Complete the function frequencycount() that takes the array and n
as input parameters and modify the array itself in place to denote the frequency count of each element from 1 to N.
i,e element at index 0 should represent the frequency of 1, and so on.
*/



class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        // Adding All the Array Values as Keys and their Frequency as Values in HashMap
        // arr.length = N and arr[i]<P
        for (int i=0; i<N; i++){
            if (arr[i] > N){
                continue;
            }
            int count = map.getOrDefault(arr[i],0);
            map.put(arr[i],count+1);
        }

        // Replace the Orignal Array Values with Frequency of Elements from 1 to N
        // This Means that arr[0] should have the frequency of 1 and arr[1] should have frequency of 2
        for (int i=0; i<arr.length; i++){
            arr[i] = map.getOrDefault(i+1,0);
        }
    }
}
