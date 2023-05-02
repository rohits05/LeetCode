class Solution {
    public int countSquares(int[][] a) {
        int n =a.length, m =a[0].length;
        int dp[][] = new int[n][m];
        
        for(int j=0; j<m; j++) dp[0][j] = a[0][j];
        for(int i=0; i<n; i++) dp[i][0] = a[i][0];
        
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                
                if(a[i][j] == 1)
                    dp[i][j] = 1 + Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]));
                else dp[i][j] = 0;
            }
        }
        
        int ans =0; 
        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++) ans += dp[i][j];
        
        return ans;
    }
}