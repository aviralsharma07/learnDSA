/*
- Recursion: It is a phenomenon when a function calls itself indefinitely until a specified condition is fulfilled.
- Whenever recursion calls are executed, they’re simultaneously stored in a recursion stack where they wait for the completion of the recursive function.
- A recursive function can only be completed if a base condition is fulfilled and the control returns to the parent function.
*/

import java.util.Scanner;

public class Recursion {

    // Function to Print numbers from 1 to N using Recursion.
    static void printOnetoN(int i, int n){
        // Base Condition
        if (i>n) return;
        System.out.print(i+" ");

        // Function call to print i till i increments to n
        printOnetoN(++i,n);

        // Time Complexity: O(n) -> Since the Function is called n times and in each call max time is O(1)
        // Space Complexity: O(n) -> Maximum Space is consumed when entire recursion stack is filled.
    }

    static void printOnetoNusingBacktracking(int i, int n){
        // Base Condition
        if (i<1) return;

        // Function call to print (n-1) integers.
        printOnetoNusingBacktracking(i-1,n);
        System.out.print(i+" ");
        
        // Time Complexity: O(n) -> Since the Function is called n times and in each call max time is O(1)
        // Space Complexity: O(n) -> Maximum Space is consumed when entire recursion stack is filled.
    }

    // MAIN FUNCTION STARTS
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.print("Enter m: ");
        int m = in.nextInt();
        printOnetoN(1,n);
        System.out.println();
        printOnetoNusingBacktracking(m,m);
    }
}
