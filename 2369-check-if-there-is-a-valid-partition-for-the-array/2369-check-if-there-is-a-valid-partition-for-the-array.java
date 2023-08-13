class Solution {
    public boolean validPartition(int[] nums) {
        int n = nums.length;
        boolean[] dp = new boolean[5];
        dp[0] = true;
        
        for(int i=2; i<=n; i++){
            int idx = i % 5;
            dp[idx] = dp[(i-2) % 5] && nums[i-2] == nums[i-1];
            dp[idx] |= i>2 && dp[(i-3) % 5] && nums[i-3] == 
                              nums[i-2] && nums[i-2] == nums[i-1];
            dp[idx] |= i>2 && dp[(i-3) % 5] && nums[i-3]+1 == 
                              nums[i-2] && nums[i-2]+1 == nums[i-1];
        }
        
        return dp[n%5];
    }
}