Problem Link: https://leetcode.com/problems/sum-of-beauty-of-all-substrings/description/

// OPTIMIZED SOLUTION
// Instead of Saving the Frequency of each Substring in Hashmap and iterating over Hashmap every time for a new Substring,
// We save the Frequencies of Characters of Substrings in a freq array and find the beauty then and there. 

public static int beautySum(String s){
        int n = s.length();
        int ans = 0;
        for (int i=0; i<n; i++){
            int[] freq = new int[26];
            for (int j=i; j<n; j++){
                freq[s.charAt(j) - 'a']++;
                int min = getMin(freq);
                int max = getMax(freq);

                int beauty = max - min;

                ans += beauty;
            }
        }
        return ans;
    }

    public static int getMin(int[] freq){
        int min = Integer.MAX_VALUE;
        for (int i=0; i<26; i++){
            if (freq[i] != 0) min = Math.min(min, freq[i]);
        }
        return min;
    }

    public static int getMax(int[] freq){
        int max = Integer.MIN_VALUE;
        for (int i=0; i<26; i++){
            if (freq[i] != 0) max = Math.max(max,freq[i]);
        }
        return max;
    }


// --------------------------- BRUTE FORCE SOLUTION --------------------------
// - Find each Substring and for each Substring:
//   --> Store Frequency of Characters in HashMap
//   --> Extract Min and Max Freq by iterating over Map
//   --> Time Complexity: O(N)
  
//public static int beautySum(String s){
//    int n = s.length();
//    int answer = 0;
//    for (int i=0; i<n; i++){
//        for (int j=i; j<n; j++){
//            String subString = s.substring(i,j+1);
//            answer += beautyofString(subString);
//        }
//    }
//    return answer;
//}
//
//public static int beautyofString(String s){
//    HashMap<Character,Integer> map = new HashMap<>();
//    for (char c: s.toCharArray()){
//        map.put(c,map.getOrDefault(c,0)+1);
//    }
//
//    int minFrequency = Integer.MAX_VALUE;
//    int maxFrequency = Integer.MIN_VALUE;
//
//    for (int frequency : map.values()) {
//        minFrequency = Math.min(minFrequency, frequency);
//        maxFrequency = Math.max(maxFrequency, frequency);
//    }
//    return maxFrequency-minFrequency;
//}
