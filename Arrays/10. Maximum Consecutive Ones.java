public class MaximumConsecutiveOnes {

    /*
         Question Link: https://leetcode.com/problems/max-consecutive-ones/
         
         Optimal Solution: - Take Two Variable max and temp_max as 0 initially.
                           - max will hold maximum consecutive sequence.
                           - temp_max will hold current sequence of 1 while counting.
                           - Iterate through array and do the following: 
                              -- When you encounter 1, increment temp_max by 1
                              -- When you encounter 0:
                                   ~ Compare max and temp_max, set max = temp_max if (temp_max > max)
                                   ~ Set temp_max to 0 again
                            - After Loop Ends, Compare max and temp_max again -> swap if required.
                            - return the final value of max as answer
                            - Time Complexity: O(N)
                            - Space Complexity: O(1)     
                                   
    */
    
    static int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int maxOnes = 0;
        int tempMaxOnes = 0;
        for (int i=0; i<n; i++){
            if (nums[i] == 1){
                tempMaxOnes += 1;
            }
            if (nums[i] == 0){
                if (tempMaxOnes > maxOnes){
                    maxOnes = tempMaxOnes;
                }
                tempMaxOnes = 0;
            }
        }
        if (tempMaxOnes > maxOnes){
            maxOnes = tempMaxOnes;
        }
        return maxOnes;
    }


    public static void main(String[] args) {
        int[] arr = {0,0,1,0,0,1,1,1,0};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
