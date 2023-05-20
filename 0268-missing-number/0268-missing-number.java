class Solution {
    public int missingNumber(int[] nums) {
        int res =0, n =nums.length;
        for(int i=0; i<=n; i++) res ^= i; // 0 -inc
        for(int i=0; i<n; i++) res ^= nums[i];
        
        return res;
    }
}