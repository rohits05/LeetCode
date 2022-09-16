class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n =nums.length, rCnt =1;
        
        int op[] = new int[n];
        op[0] = 1;
        
        for(int i=1; i<n; i++) op[i] = op[i-1] * nums[i-1];
        
        for(int i=n-1; i>=0; i--){ op[i] = op[i] * rCnt; rCnt = rCnt * nums[i]; }
        
        return op;
    }
}