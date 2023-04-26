class Solution {
    public boolean isMatch(String str, String pattern) {
        int m =str.length(), n =pattern.length();
        
        boolean dp[][] = new boolean[m+1][n+1];
        dp[0][0] = true;
        
        for(int i=1; i<m+1; i++) dp[i][0] = false;
        for(int j=1; j<n+1; j++){
            if(pattern.charAt(j-1) == '*') dp[0][j] = dp[0][j-1];
        }
        
        for(int i=1; i<m+1; i++){
            for(int j=1; j<n+1; j++){
                if(str.charAt(i-1) == pattern.charAt(j-1) || pattern.charAt(j-1) == '?')
                    dp[i][j] = dp[i-1][j-1];
                else if(pattern.charAt(j-1) == '*')
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                else 
                    dp[i][j] = false;
            }
        }
        return dp[m][n];
    }
}