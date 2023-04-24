class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int m =str1.length(), n =str2.length();
        int[][] dp = new int[m+1][n+1];
        
        for(int i=0; i<=m; i++) dp[i][0] = 1;
        for(int j=0; j<=n; j++) dp[0][j] = 1;
        
        for(int i=1; i<=m; i++){ // LCS ~
            for(int j=1; j<=n; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)) dp[i][j] = 1+dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
            }
        }
        
        String ans = ""; // Twitch ~
        
        while(m>=1 && n>=1){
            if(str1.charAt(m-1) == str2.charAt(n-1)){
                ans = str1.charAt(m-1) + ans;
                m--;
                n--;
            }else{
                if(dp[m-1][n] > dp[m][n-1]){
                    ans = str1.charAt(m-1) + ans;
                    m--;
                }else{
                    ans = str2.charAt(n-1) + ans;
                    n--;
                }
            }
        }
        
        while(m > 0) ans = str1.charAt(--m) + ans;
        while(n > 0) ans = str2.charAt(--n) + ans;
        
        return ans;
    }
}