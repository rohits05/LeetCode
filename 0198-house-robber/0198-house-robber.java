class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        
        int dp[] = new int[n+1];
        dp[0] = 0; dp[1] = nums[0];
        
        for(int i=1; i<n; i++) dp[i+1] = Math.max(dp[i], dp[i-1]+nums[i]);
        return dp[n];
    }
}