class Solution {
    public boolean canJump(int[] nums) {
        int n =nums.length, LastGoodIdxPosiT =n-1;
        
        for(int i=n-1; i>=0; i--)
            if(i+nums[i] >= LastGoodIdxPosiT) LastGoodIdxPosiT = i;
        
        return LastGoodIdxPosiT == 0;
        // int reach =0;
        // for(int i=0; i<nums.length; i++){
        //     if(reach < i) return false;
        //     reach = Math.max(reach, i + nums[i]);
        // }
        // return true;
    }
}