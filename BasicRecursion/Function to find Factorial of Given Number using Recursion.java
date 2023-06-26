/*
- Recursion: It is a phenomenon when a function calls itself indefinitely until a specified condition is fulfilled.
- Whenever recursion calls are executed, they’re simultaneously stored in a recursion stack where they wait for the completion of the recursive function.
- A recursive function can only be completed if a base condition is fulfilled and the control returns to the parent function.
*/

import java.util.Scanner;

public class Recursion {

    // Function to find Factorial of Given Number.
    static void factorialUsingParameterizedWay(int i, int factorial){

        // Base Condition
        if (i<1){
            System.out.println(factorial);
            return;
        }

        factorialUsingParameterizedWay(i-1,factorial*i);

        // Time Complexity: O(n) -> Since the Function is called n times and in each call max time is O(1)
        // Space Complexity: O(n) -> Maximum Space is consumed when entire recursion stack is filled.
    }

    static int factorialUsingFunctionalWay(int i){

        // Base Condition
        if (i == 1){
            return 1;
        }

        return i * factorialUsingFunctionalWay(i-1);

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
        factorialUsingParameterizedWay(n,1);
        System.out.println(factorialUsingFunctionalWay(m));

    }
}
