class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        // int[][] dp = new int[n][amount+1];
        
        // Space opTimizeD !1
        int prev[] = new int [amount+1];
        // for(int i=0; i<n; i++) prev[i] = 1;
            // dp[i][0] = 1;
        
        for(int j=0; j<=amount; j++){
            if(j % coins[0] == 0) prev[j] = 1;
                // dp[0][j] = 1;
            else prev[j] = 0;
                // dp[0][j] = 0;
        }
        
        for(int i=1; i<n; i++){
             for(int j=0; j<=amount; j++){
                 int nT = prev[j],
                     // dp[i-1][j], 
                 t =0;
                 
                 if(coins[i] <= j) t = prev[j - coins[i]];
                     // dp[i][j-coins[i]];
                 prev[j] = nT + t;
                 // dp[i][j] =  nT + t;
             }
         }
                    
        return prev[amount];
        // return dp[n-1][amount];
    }
}