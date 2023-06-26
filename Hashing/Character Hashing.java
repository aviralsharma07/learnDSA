/*
Hashing: Prestoring and Fetching
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Recursion {

    // MAIN FUNCTION STARTS
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        String s = in.next();
        System.out.println(s);

        // We can use 256 Size Hash Array if we have both upper and lower case characters in the String. 
        // We don't need to subtract 'a' from the string characters.
        // precompute
        int[] hash = new int[26];
        for (int i=0; i<s.length(); i++){
            hash[s.charAt(i)-'a']+=1;
        }

        // Fetching
        for(int i=0; i<s.length(); i++){
            System.out.println("Count of "+s.charAt(i)+" in the String is " + hash[s.charAt(i)-'a']);
        }
    }
}
