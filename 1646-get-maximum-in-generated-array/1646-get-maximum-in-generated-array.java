class Solution {
    public int getMaximumGenerated(int n) {
        int[] dp = new int[n+1];
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<n+1; i++){ // foloow up cases
            if(i == 0) dp[i] = 0;
            else if(i == 1) dp[i] = 1;
            else if(i % 2 == 0) dp[i] = dp[i/2];
            else dp[i] = dp[i/2] + dp[(i/2) + 1];
            max = Math.max(max, dp[i]);
        }   
        
        return max;
    }
}