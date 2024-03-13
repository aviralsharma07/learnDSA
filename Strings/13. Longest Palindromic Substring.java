// Problem Link: https://leetcode.com/problems/longest-palindromic-substring/description/

// 1. -------------------------------- BRUTE FORCE SOLUTION --------------------------------
//   - ITERATE THROUGH EACH SUBSTRING 
//   - FOR EACH SUBSTRING : CHECK IF THEY ARE PAILINDROME AND THEIR LENGTH IS LONGER THAN SUPPOSED ONE
//   TIME COMPLEXITY: O(n^3)
  
// public static String longestPalindrome(String s) {
//         String answer = "";
//         for (int i=0; i<s.length(); i++){
//             for (int j=i; j<s.length(); j++){
//                 String subString = s.substring(i,j+1);
//                 System.out.println(subString + " "+ subString.length());
//                 if (isPailindrome(subString) && subString.length() > answer.length()){
//                     answer = subString;
//                 }
//             }
//         }
//         return answer;
//     }

//     public static boolean isPailindrome(String s){
//         s = s.toLowerCase();
//         int i = 0;
//         int j = s.length() - 1;
//         while (i<j){
//             if (s.charAt(i) != s.charAt(j)) return false;
//             i++;
//             j--;
//         }
//         return true;
//     }


// 2. -------------------------------- Expand from Centre Approach --------------------------------
// - We Iterate to each character of String
// - Assume it to be centre and expand to both LHS and RHS from it.
// - We Store the length if a Palindrome is formed around it
// - We do it for every character and store the start and end indexes for maximum palindromic substring. 
  
public static String longestPalindrome(String s){
        int start = 0, end = 0;
        for (int i=0; i<s.length(); i++){
            int len1 = expandFromCentre(s,i,i+1);
            int len2 = expandFromCentre(s,i,i);
            int len = Math.max(len1,len2);

            // Finding Start and End
            if (end-start < len){
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start,end+1);
    }

    public static int expandFromCentre(String s, int i, int j){
        while (i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)){
            i--; j++;
        }
        return j-i-1;
    }
  
