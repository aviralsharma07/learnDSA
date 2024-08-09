// Problem Link: https://www.geeksforgeeks.org/problems/fruit-into-baskets-1663137462/1


class Solution {
    public static int totalFruits(Integer[] arr) {
        int l=0, r=0, maxLen=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int k = 2;
        
        while(r < arr.length){
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            
            if (map.size() > k) {
                map.put(arr[l],map.get(arr[l])-1);
                if (map.get(arr[l]) == 0) map.remove(arr[l]);
                l++;
            }
            maxLen = Math.max(maxLen,r-l+1);
            r++;
        }
        
        return maxLen;
    }
}
