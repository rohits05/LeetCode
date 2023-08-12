class Solution {    
    public boolean canSplitArray(List<Integer> nums, int m) {    
        int n = nums.size(), sum = 0;
        Boolean[][] dp = new Boolean[n][n];
        
        for(int ele: nums) sum += ele;
        boolean res = isPossibleToSplit(nums, 0, n-1, sum, m, dp);
        return res;
    }
    
        private boolean isPossibleToSplit(List<Integer> nums, int si, int ei, int sum, int m, Boolean[][] dp){
        if(ei - si+1 <= 2) return true;
        if(dp[si][ei] != null) return dp[si][ei];

        boolean res = false;
        if(sum-nums.get(si) >= m)
            res = res || 
            isPossibleToSplit(nums, si+1, ei, sum - nums.get(si), m, dp);
        if(sum-nums.get(ei) >= m)
            res = res || 
            isPossibleToSplit(nums, si, ei-1, sum - nums.get(ei), m, dp);
        
        return dp[si][ei] = res;
    }
}