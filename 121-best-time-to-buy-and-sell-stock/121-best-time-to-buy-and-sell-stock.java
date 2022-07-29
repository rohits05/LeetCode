class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minI = Integer.MAX_VALUE;
        
        for(int i=0; i<prices.length; i++){
            // if(prices[i] < minI) 
            //     minI = prices[i];
            // else if(prices[i] - minI > profit)
            //     profit = prices[i] - minI;
            minI = Math.min(minI, prices[i]);
            profit = Math.max(profit, prices[i] - minI);
        }
        return profit;
    }
}