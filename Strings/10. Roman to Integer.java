// Problem Link: https://leetcode.com/problems/roman-to-integer/description/
/*
BRUTE FORCE SOLUTION
class Solution {
    public int romanToInt(String s) {
        int ans = 0; // Initialize the result variable to store the integer value
        
        // Loop through each character in the Roman numeral string
        for (int i = 0; i < s.length(); i++) {
            // Check if the current character is 'I'
            if (s.charAt(i) == 'I') {
                // Check if 'I' is followed by 'V', if so, add 4 to the result and skip the next character
                if (i != s.length() - 1 && s.charAt(i + 1) == 'V') {
                    ans += 4;
                    i++;
                } 
                // Check if 'I' is followed by 'X', if so, add 9 to the result and skip the next character
                else if (i != s.length() - 1 && s.charAt(i + 1) == 'X') {
                    ans += 9;
                    i++;
                }
                // If neither 'V' nor 'X' follows 'I', add 1 to the result
                else {
                    ans += 1;
                }
            } 
            // Similar checks and actions are performed for 'V', 'X', 'L', 'C', 'D', and 'M'
            else if (s.charAt(i) == 'V') {
                ans += 5;
            } else if (s.charAt(i) == 'X') {
                if (i != s.length() - 1 && s.charAt(i + 1) == 'L') {
                    ans += 40;
                    i++;
                } else if (i != s.length() - 1 && s.charAt(i + 1) == 'C') {
                    ans += 90;
                    i++;
                } else {
                    ans += 10;
                }
            } else if (s.charAt(i) == 'L') {
                ans += 50;
            } else if (s.charAt(i) == 'C') {
                if (i != s.length() - 1 && s.charAt(i + 1) == 'D') {
                    ans += 400;
                    i++;
                } else if (i != s.length() - 1 && s.charAt(i + 1) == 'M') {
                    ans += 900;
                    i++;
                } else {
                    ans += 100;
                }
            } else if (s.charAt(i) == 'D') {
                ans += 500;
            } else {
                ans += 1000;
            }
        }
        
        return ans; // Return the final integer result
    }
}
*/

import java.util.*;

class Solution {
    public int romanToInt(String s) {
        // Create a HashMap to store the values of Roman numerals
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        
        int ans = 0; // Initialize the result variable
        
        // Loop through each character in the Roman numeral string
        for (int i = 0; i < s.length(); i++) {
            // Get the integer value of the current Roman numeral
            int currentValue = romanValues.get(s.charAt(i));
            
            // Check if the current value is less than the next value, subtract it from the result
            if (i < s.length() - 1 && romanValues.get(s.charAt(i + 1)) > currentValue) {
                ans -= currentValue;
            } 
            // Otherwise, add it to the result
            else {
                ans += currentValue;
            }
        }
        
        return ans; // Return the final integer result
    }
}
