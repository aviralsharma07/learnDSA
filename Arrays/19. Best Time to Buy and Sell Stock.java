public class BestTimeToBuyAndSellStock {

    /*
        Question Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
        Brute Force Approach: - Use 2 Loops
                              - For each element find the maximum element to their right and store their difference
                              - After Finding maximum for current iterating element compare this current maximum with previous element max
                              - if (currentMax > prevMax) -> prevMax = currentMax
                              -  Return prevMax as Maximum Profit
                              - Time Complexity: O(N*N)
                              - Space Complexity: O(1)

        Optimal Solution: - Use Dynamic Programming
                          - Take a variable maxProfit = 0, minLeft = arr[0];
                          - Iterate through the array and do the following:
                                  ~ Find Profit on Current day: currProfit = arr[i] - minLeft
                                  ~ if (currProfit > maxProfit) -> maxProfit = currProfit
                                  ~ Update minLeft element if (arr[i] < minLeft) -> minLeft = arr[i]
                          - Return the maxProfit as answer
                          - Time Complexity: O(N)
                          - Space Complexity: O(1)         
    */

    static int maximumProfit(int[] prices){
        int n = prices.length;
        int maxProfit = 0;
        int minimumLeft = prices[0];
        for (int i=1; i<n; i++){
            int cost = prices[i] - minimumLeft;
            maxProfit = Math.max(maxProfit,cost);
            minimumLeft = Math.min(minimumLeft,prices[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        System.out.println(maximumProfit(arr));
    }
}
