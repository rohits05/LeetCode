class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length <= 1) return 1;
        // Tabulation
        int n = cost.length;
        // int dp[] = new int[n+1];
        // dp[0] =0; dp[1]=0;
        // for(int i=2; i<=n; i++){
        //     dp[i] = 
        // }
        
        // Space Optimization
        int prev = 0;
        int curr = 0;
        int res =0;
        for(int i=2; i<=n; i++){
            res = Math.min(prev + cost[i-2], curr + cost[i-1]);
            prev = curr;
            curr = res;
        }
        return curr;
    }
}