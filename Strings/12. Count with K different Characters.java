// Problem Link: https://www.codingninjas.com/studio/problems/count-with-k-different-characters_1214627?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

// HAS TO SOLVE AGAIN USING SLIDING WINDOW

import java.util.HashSet;

public class CountWithKDifferentCharacters {
    public static void main(String[] args) {
        System.out.println(countSubStrings("abcde",2));
    }

    public static int countSubStrings(String str, int k) {
        int n = str.length();
        int count = 0;
        for (int i=0; i<n; i++){
            for (int j=i; j<n; j++){
                String subString = str.substring(i,j+1);
                System.out.println(subString);
                if (isUnique(subString,k)) count++;
            }
        }
        return count;
    }

    public static boolean isUnique(String subStr, int k){
        HashSet<Character> uniqueChars = new HashSet<>();
        for (char c : subStr.toCharArray()) {
            uniqueChars.add(c);
        }
        return uniqueChars.size() == k;
    }

}
