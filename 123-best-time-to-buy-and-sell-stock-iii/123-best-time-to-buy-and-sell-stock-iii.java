class Solution {
    public int maxProfit(int[] price) {
       int n = price.length;
        
       // Space Optimization Technique!!
       int buy1 = Integer.MAX_VALUE;
       int buy2 = Integer.MAX_VALUE;
       int profit1 = 0;
       int profit2 = 0;
       for(int i=0 ;i<n ;i++) {
          buy1 = Math.min(buy1, price[i]);
          profit1 = Math.max(profit1, price[i]-buy1);
          buy2 = Math.min(buy2, price[i]-profit1);
          profit2 = Math.max(profit2, price[i]-buy2);
       }
       return profit2;
    }
}