class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        // Tabulation ~!
        int m = s1.length(), n = s2.length();
//      int[][] dp = new int[m+1][n+1];
        
//      for(int i=1; i<=m; i++){
//             for(int j=1; j<=n; j++){
//                 if(s1.charAt(i-1) == s2.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
//                 else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
//             }
//         }
        
//         return dp[m][n];
        
        // Space OpTimization ~!
        int[] dp = new int[n+1];
            
        for(int i=1; i<=m; i++){
               int[] curr = new int[n+1];
               for(int j=1; j<=n; j++){
                   if(s1.charAt(i-1) == s2.charAt(j-1)) curr[j] = 1 + dp[j-1];
                   else curr[j] = Math.max(dp[j],curr[j-1]);
                }
            dp = curr;
        }
        return dp[n];
    }
}