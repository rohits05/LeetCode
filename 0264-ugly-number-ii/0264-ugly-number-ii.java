class Solution {
    public int nthUglyNumber(int n) {
        int c2 =0, c3 =0, c5 =0;
        int[] dp = new int[n+1];
        dp[0] = 1;
        
        for(int i=1; i<=n; i++){
            dp[i] = Math.min(2 * dp[c2], Math.min(3 * dp[c3], dp[c5] * 5));
            if(dp[i] == 2 * dp[c2]) c2++;
            if(dp[i] == 3 * dp[c3]) c3++;
            if(dp[i] == 5 * dp[c5]) c5++;
        }
        
        return dp[n-1];
    }
}