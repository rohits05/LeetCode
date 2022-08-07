class Solution {
    public boolean canJump(int[] nums) {
        int LastGoodIdxPosiT = nums.length-1;
        
        for(int i=nums.length-1; i>=0; i--){
            if(i+nums[i] >= LastGoodIdxPosiT)
                LastGoodIdxPosiT = i;
        }
        return (LastGoodIdxPosiT == 0);
    }
}