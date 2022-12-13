class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int result = Integer.MAX_VALUE;
        
        int[] dp = new int[n];
        for(int i=0; i<n; i++) dp[i] = matrix[0][i];
        
        for(int i=1; i<m; i++){
            int[] temp = new int[n];
            for(int j=0; j<n; j++){
                int up = matrix[i][j] + dp[j], left = matrix[i][j], right = matrix[i][j];
                
                if(j > 0) left += dp[j - 1];
                else left = (int)Math.pow(10,9);
                
                if(j < n - 1) right += dp[j + 1];
                else right = (int)Math.pow(10,9);
                
                temp[j] = Math.min(up, Math.min(left, right));
            }
            dp = temp;
        }
        
        for(int i=0; i<n; i++) result = Math.min(result, dp[i]);
        return result;
    }
}