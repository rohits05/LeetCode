class Solution {
    public int maxProfit(int[] prices) {
        int profit =0, n=prices.length;
        
        for(int i=1; i<n; i++) // Graphical manner of stocks
            if(prices[i] > prices[i-1]) profit += prices[i] - prices[i-1];
        
        return profit;
    }
}