import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class FindUnion {

    /*
        Question Link: https://practice.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1
        
        Brute Force Solution: - Create a Hash Array and Save the frequencies of all the elements in arr1 and arr2
                              - Iterate Hash Array and add all the indexes to the List with hash[index]>0
                              - return the List.
                              - Time Complexity: O(M+N+Max(Arr[i]))
                              - Space Complexity: O(N)

        Better Solution: - Use Set to get Distinct Elements of both arrays.
                         - Iterate through Set and add its elements to List
                         - Return the List
                         - Time Complexity: O(N+M)
                         - Space Complexity: O(N)

    */

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        int[] hash = new int[1000000];
        HashSet<Integer> union = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<n; i++) union.add(arr1[i]);
        for (int i=0; i<m; i++) union.add(arr2[i]);

        for (int i: union){
            list.add(i);
        }
        Collections.sort(list);
        return list;
    }


    public static void main(String[] args) {
        int[] arr1 = {1,35};
        int[] arr2 = {6 ,9 ,13 ,15 ,20 ,25 ,29 ,46};
        ArrayList<Integer> answer = findUnion(arr1,arr2,arr1.length,arr2.length);
        System.out.println(answer);
    }
}
