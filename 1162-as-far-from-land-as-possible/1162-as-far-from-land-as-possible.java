class Solution {
    public int maxDistance(int[][] grid) {
        int n = grid.length, sum = 0;
        int[][] dp = new int[n][n];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                sum += grid[i][j];    
                if(grid[i][j] == 1) continue;
                
                int top , left;
                if(i-1 >= 0) top = dp[i-1][j];
                else top = 2*n;
                
                if(j-1 >= 0) left = dp[i][j-1];
                else left = 2*n;
                dp[i][j] = Math.min(top, left)+1;
            }
        }
        
        if(sum == n*n || sum == 0) return -1;
        int max = 0;
        
        for(int i=n-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                if(grid[i][j] == 1) continue;
                int bottom = i+1<n ? dp[i+1][j] : 2*n;
                int right = j+1<n ? dp[i][j+1] : 2*n;
                
                dp[i][j] = Math.min(Math.min(bottom, right)+1, dp[i][j]);
                max = Math.max(max, dp[i][j]);
            }
        }
        
        return max;
    }
}