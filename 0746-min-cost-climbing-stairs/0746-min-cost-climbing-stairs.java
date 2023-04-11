class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if(n <= 1) return 1;
        
        int prev =0, cur =0, res =0;
        for(int i=2; i<=n; i++){
            res = Math.min(prev + cost[i-2], cur + cost[i-1]);
            prev = cur; cur = res;
        }
        return cur;
    }
}