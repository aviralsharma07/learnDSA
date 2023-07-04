import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    /*
        Question Link: https://leetcode.com/problems/single-number/

        Solution: - Store the elements, frequency as key value pair in a HashMap
                  - Iterate through Map and return the key with value = 1
                  - Time Complexity: O(N)
                  - Space Complexity: O(1)
    */

    static int singleNumber(int[] nums) {
        int answer = nums[0];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int count = map.getOrDefault(nums[i],0);
            map.put(nums[i], count+1);
        }
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if (e.getValue() == 1){
                answer = e.getKey();
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }
}
