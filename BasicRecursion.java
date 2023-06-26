/*
- Recursion: It is a phenomenon when a function calls itself indefinitely until a specified condition is fulfilled.
- Whenever recursion calls are executed, they’re simultaneously stored in a recursion stack where they wait for the completion of the recursive function.
- A recursive function can only be completed if a base condition is fulfilled and the control returns to the parent function.
*/

import java.util.Scanner;

public class Recursion {

    // Function to Print a Name N times using Recursion.
    static void nameNTimes(int n){
        // Base Condition
        if (n == 0) return;
        System.out.println("Aviral");
        n--;
        nameNTimes(n);
        // Time Complexity: O(n) -> Since the Function is called n times and in each call max time is O(1)
        // Space Complexity: O(n) -> Maximum Space is consumed when entire recursion stack is filled.
    }

    // MAIN FUNCTION STARTS
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        nameNTimes(n);
    }
}
