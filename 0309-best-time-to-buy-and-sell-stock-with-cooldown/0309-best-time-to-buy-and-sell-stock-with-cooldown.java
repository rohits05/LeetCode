class Solution {
    public int maxProfit(int[] A) {
        int buyNow =0, sellNow =0;
        int buyNext =0, sellNext =0;
        int coolDown =0, n =A.length;
    
        for(int i=n-1; i>=0; i--){ 
            sellNow = Math.max(A[i] + coolDown, sellNext);
            buyNow = Math.max(sellNext - A[i], buyNext);
             
            coolDown = buyNext; buyNext = buyNow; sellNext = sellNow; 
         }
        
        return buyNow;
    }
}