class Solution {
    public int maxProfit(int[] prices, int fee) {
        int aNB =0, aB =0; // B&SS-II Modification !1
        int cB, cNB;
        
        for(int i=prices.length-1; i>=0; i--){
            cNB = Math.max(prices[i] - fee + aB, 0 + aNB); // Sell ~
            cB = Math.max(-prices[i] + aNB, 0 + aB); // Buy !
            
            aB = cB; aNB = cNB;
        }
        
        return aB;
    }
}