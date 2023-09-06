class Solution {
   public int helper(List<Integer> nums, int ind, int prev, int[][] dp) {
        if(ind == -1) return 0;
        if(dp[ind][prev] != -1) return dp[ind][prev];
        if(nums.get(ind) > prev) return dp[ind][prev] = 1 + helper(nums, ind-1, prev, dp);
        
        int change = 1 + helper(nums, ind - 1, prev, dp);
        int notchange = helper(nums, ind - 1, nums.get(ind), dp);
        return dp[ind][prev] = Math.min(change, notchange);
   }
    
   public int minimumOperations(List<Integer> nums) {
        int n = nums.size();
       
        int[][] dp = new int[n][4];
        for(int[] row: dp) Arrays.fill(row, -1);
        return helper(nums, n-1, 3, dp);    
    }
}