class Solution {
    public boolean canJump(int[] nums) {
        int n =nums.length, LastGoodIdxPosiT =n-1;
        
        for(int i=n-1; i>=0; i--)
            if(i+nums[i] >= LastGoodIdxPosiT) LastGoodIdxPosiT = i;
        
        return LastGoodIdxPosiT == 0;
    }
}