class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]","");
        s = s.toLowerCase();
        return pailindrome(0,s.length()-1,s);
        // StringBuilder newStr = new StringBuilder(s);
        // String revStr = newStr.reverse().toString();
        // return s.equals(revStr);
    }

    static boolean pailindrome(int start, int end, String s){
        // Base Condition
        if (start >= s.length()/2) return true;

        // If Characters Don't Match
        if (s.charAt(start) != s.charAt(end)) return false;

        return pailindrome(start+1,end-1,s);
    }

}
