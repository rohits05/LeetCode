class Solution {
    public int maxProfit(int[] prices) {
        int minI =prices[0], profit =0, n=prices.length;
        
        for(int i=1; i<n; i++){
            int cost = prices[i] - minI;
            profit = Math.max(cost, profit);
            minI = Math.min(minI, prices[i]); // update to new stocks
        }
        
        return profit;
    }
}