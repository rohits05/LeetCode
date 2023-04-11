class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        return Math.max(ways(nums, 0, n-1), ways(nums, 1, n));
    }
    
    private int ways(int[] nums, int start, int end) {
        int prev2 =0, prev =0, curry =0;
        
        for(int i=start; i<end; i++){
            curry = Math.max(prev2 + nums[i], prev);
            prev2 = prev; prev = curry;
        }
        return curry;
    }
}