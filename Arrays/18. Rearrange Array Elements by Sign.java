class Solution {

  // Question Link: https://leetcode.com/problems/rearrange-array-elements-by-sign/ 
  
    public int[] rearrangeArray(int[] nums) {
        int[] positive = new int[(nums.length)/2];
        int[] negative = new int[(nums.length)/2];

        int j = 0;
        for(int i=0; i<nums.length; i++){
            if (nums[i] > 0){
                positive[j++] = nums[i]; 
            }
        }

        j = 0;
        for(int i=0; i<nums.length; i++){
            if (nums[i] < 0){
                negative[j++] = nums[i]; 
            }
        }


        j = 0;
        int k = 0;
        for (int i=0; i<nums.length; i++){
            if (i%2 == 0){
                nums[i] = positive[j++];
            }else{
                nums[i] = negative[k++];
            }
        }
        
        return nums;
    }
}
