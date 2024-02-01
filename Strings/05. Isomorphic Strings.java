// Problem: https://leetcode.com/problems/isomorphic-strings/description/ 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("bbbaaaba","aaabbbba"));
    }
        public static boolean isIsomorphic(String s, String t) {
            int map1[]=new int[200];
            int map2[]=new int[200];

            if(s.length()!=t.length())
                return false;

            for(int i=0;i<s.length();i++)
            {
                if(map1[s.charAt(i)]!=map2[t.charAt(i)])
                    return false;

                map1[s.charAt(i)]=i+1;
                map2[t.charAt(i)]=i+1;
            }
            return true;
        }

//    public static boolean isomorphicStrings(String s, String t){
//        char[] sArr = s.toCharArray();
//        char[] tArr = t.toCharArray();
//        int[] sLst = new int[s.length()];
//        int[] tLst = new int[t.length()];
//        int count = 0;
//        for (int i=0; i<sArr.length; i++){
//            for (int j=0; j<sArr.length; j++){
//                if (sArr[i] == sArr[j]) {
//                    sLst[j] = count;
//                }
//            }
//            count++;
//        }
//        count = 0;
//        for (int i=0; i<tArr.length; i++){
//            for (int j=0; j<tArr.length; j++){
//                if (tArr[i] == tArr[j]) {
//                    tLst[j] = count;
//                }
//            }
//            count++;
//        }
//        System.out.println(Arrays.toString(sLst));
//        System.out.println(Arrays.toString(tLst));
//        return Arrays.equals(sLst, tLst);
//    }
}
