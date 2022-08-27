class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if(n <= 1) return 1;
        
        // Tabulation
        int dp[] = new int[n+1];
        dp[0] =0; dp[1]=0;
        for(int i=2; i<=n; i++){
            dp[i] = Math.min(dp[i-1]+cost[i-1], dp[i-2]+cost[i-2]);
        }
        return dp[n];
        
        // Space Optimization
        // int prev = 0;
        // int curr = 0;
        // int res =0;
        // for(int i=2; i<=n; i++){
        //     res = Math.min(prev + cost[i-2], curr + cost[i-1]);
        //     prev = curr;
        //     curr = res;
        // }
        // return curr;
    }
}