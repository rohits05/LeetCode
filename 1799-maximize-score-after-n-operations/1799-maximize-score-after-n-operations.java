class Solution {
    int[] dp;
    int gcd(int a, int b) { 
        if(b == 0) return a;  
        return gcd(b, a%b);
    }
    
    public int maxScore(int[] nums) {
        dp = new int[1 << 14];
        return helper(nums, 1, 0);
    }
    
    private int helper(int[] nums, int idx, int mask) {
        if(idx > (nums.length/2)) return 0;
        if(dp[mask] != 0) return dp[mask];
        
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            if((mask & (1 << i)) != 0) continue; 
            for(int j=i+1; j<nums.length; j++){ 
                if((mask & (1 << j)) != 0) continue;
                
                int newMask = mask | (1 << i) | (1 << j), score = idx * gcd(nums[i], nums[j]);
                ans = Math.max(ans, score + helper(nums, idx+1, newMask));
            }
        }
        
        return dp[mask] = ans;
    }
}