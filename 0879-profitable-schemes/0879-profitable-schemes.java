class Solution {
    private final long MOD = (long)1e9 + 7;
    private Long dp[][][];
    private long util(int profit[], int group[], int idx, int n, int minProfit, int curProfit) {
        if(idx == profit.length){
            if(curProfit>=minProfit) return 1;
            else  return 0;
        }

        if(dp[idx][n][curProfit] != null) return dp[idx][n][curProfit];

        if(group[idx]>n)
            return dp[idx][n][curProfit]=util(profit, group, idx+1, n, minProfit, curProfit)%MOD;
        else{
            long ret=util(profit, group, idx+1, n-group[idx], minProfit, Math.min(minProfit, curProfit+profit[idx])) + util(profit, group, idx+1, n, minProfit, curProfit);
            ret %= MOD;
            
            return dp[idx][n][curProfit] = ret;
        }
    }
    
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        dp = new Long[profit.length][n+1][101];
        return (int)util(profit, group, 0, n, minProfit, 0);
    }
}