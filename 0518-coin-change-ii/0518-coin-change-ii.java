class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1] ;
        for(int i=0; i<n; i++) dp[i][0] = 1;
        
        for(int j=0; j<=amount; j++){
            if(j % coins[0] == 0) dp[0][j] = 1;
            else dp[0][j] = 0;
        }
        
        for(int i=1; i<n; i++){
             for(int j=1; j<=amount; j++){
                 int nT =dp[i-1][j], t =0;
                 
                 if(coins[i] <= j) t = dp[i][j-coins[i]];
                 dp[i][j] =  nT + t;
             }
         }
                    
        return dp[n-1][amount];
    }
}