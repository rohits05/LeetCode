class Solution {
    public int missingNumber(int[] nums) {
        int sum =0, n =nums.length;
        for(int i=0; i<=n; i++) sum ^= i; 
        for(int i=0; i<n; i++) sum ^= nums[i];
        return sum;
    }
}