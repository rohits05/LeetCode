class Solution {
    int solve(String s, int dp[][], int i, int j) {
        if(i >= j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
                  
        if(s.charAt(i) == s.charAt(j))
            return dp[i][j] = solve(s, dp, i+1, j-1);
        
        return dp[i][j] = 1 + Math.min(solve(s, dp, i+1, j), solve(s, dp, i, j-1));
    }
    
    public int minInsertions(String s) {
        int n = s.length();
        int dp[][] = new int[n+1][n+1];
        
        for(int[] d: dp) Arrays.fill(d, -1);
        return solve(s, dp, 0, n-1);
    }
}