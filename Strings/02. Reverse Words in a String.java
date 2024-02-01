// Question: https://leetcode.com/problems/reverse-words-in-a-string/description/

class Solution {
    public String reverseWords(String s) {
      // Remove the Trailing and Leading Spaces from the words and add all the wors in an Array. 
        String[] words = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();

      // Iterate through the array in reverse order and these words in the array to answer. 
        for (int i=words.length-1; i>=0; i--){
            ans.append(words[i]);
            if (i > 0){
                ans.append(" ");
            }
        }

      //Return the reversed word sentence
        return ans.toString();
    }
}
