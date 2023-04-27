class Solution {
    public int maxProfit(int[] A) {
        int curbuy =0, cursell =0;
        int nextbuy =0, nextsell =0;
        int coolbuy =0, n =A.length;
    
        for(int i=n-1; i>=0; i--){ 
            cursell = Math.max(A[i] + coolbuy, nextsell);
            curbuy = Math.max(nextsell - A[i], nextbuy);
             
            coolbuy = nextbuy; nextbuy = curbuy; nextsell = cursell; 
         }
        
        return curbuy;
    }
}