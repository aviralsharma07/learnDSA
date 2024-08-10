// PROBLEM LINK: https://leetcode.com/problems/longest-repeating-character-replacement/



class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, r = 0, maxLen = 0,maxFreq = 0;
        int n = s.length();
        HashMap<Character,Integer> map= new HashMap<>();

        while (r < n){
            char ch = s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxFreq = Math.max(maxFreq,map.get(ch));

            while((r-l+1)-maxFreq > k){
                char ch2=s.charAt(l);
                map.put(ch2,map.get(ch2)-1); //decrement the frequency
                l++;
            }

            maxLen=Math.max(maxLen,r-l+1);

            r++;
        }

        return maxLen;
    }
}
