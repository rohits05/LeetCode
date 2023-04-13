class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n =matrix.length, m =matrix[0].length;
        int maxI = Integer.MAX_VALUE;
        
        int[][] dp = new int[n][m];
        
        for(int i=0; i<m; i++) dp[0][i] = matrix[0][i]; // Base ~ Case !
        
        for(int i=1; i<n; i++){
            for(int j=0; j<m; j++){
                int up = matrix[i][j] + dp[i - 1][j],
                left = matrix[i][j], right = matrix[i][j]; // bottom - up moves !
                
                if(j> 0) left += dp[i - 1][j - 1]; // OuT of BounD Case ~ leftwards
                else left = (int)Math.pow(10,9);
                
                if(j < n - 1) right += dp[i - 1][j + 1]; // OuT of BounD Case ~ rightwards
                else right = (int)Math.pow(10,9);
                
                dp[i][j] = Math.min(up, Math.min(left, right));
            }
        }
        
        for(int i=0; i<m; i++) maxI = Math.min(maxI, dp[m - 1][i]);
        return maxI;
    }
}