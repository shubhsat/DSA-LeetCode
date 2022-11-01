class Solution {
    public int maxProfit(int[] prices) {
        int left = 0, right = 1;
        int maxprof = 0; 
        while(right < prices.length){
            if(prices[left] < prices[right]){
                int profit = (prices[right] - prices[left]);
                maxprof = Math.max(maxprof, profit);
            }
            else{
                left = right;
            }
            right++;
        }
        
        return maxprof;
    }
}