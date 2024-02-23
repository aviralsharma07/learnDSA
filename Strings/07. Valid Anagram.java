// Problem: https://leetcode.com/problems/valid-anagram/description/

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(validAnagram("cat","rat"));
    }
    public static boolean validAnagram(String s, String t){
        if (s.length() != t.length()) return false;
        int[] map1 = new int[200];
        int[] map2 = new int[200];
        for (int i=0; i<s.length(); i++){
            map1[s.charAt(i)]++;
            map2[t.charAt(i)]++;
        }
        for (int i=0; i<s.length(); i++){
            if(map1[s.charAt(i)] != map2[s.charAt(i)]) return false;
        }
        return true;
    }
}
