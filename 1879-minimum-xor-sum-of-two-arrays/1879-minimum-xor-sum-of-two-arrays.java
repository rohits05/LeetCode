class Solution {
    int[][] dp;
    public int minimumXORSum(int[] nums1, int[] nums2) {
        int len = nums1.length;
        int mask = (1 << len) + 1;
        dp = new int[len][mask];
        for(int[] rows: dp) Arrays.fill(rows, Integer.MAX_VALUE);
        
        return helper(0, 0, nums1, nums2);
    }
    
    private int helper(int idx, int mask, int[] nums1, int[] nums2){
        if(idx == nums1.length) return 0;
        
        if(dp[idx][mask] != Integer.MAX_VALUE) return dp[idx][mask];
        int ans = Integer.MAX_VALUE;
        
        for(int j=0; j<nums2.length; j++){
            if((mask & (1 << j)) == 0)
                ans = Math.min(ans, (nums1[idx] ^ nums2[j]) +
                      helper(idx+1, mask | (1 << j), nums1, nums2));
        }
        
        return dp[idx][mask] = ans;
    }
}