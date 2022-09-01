class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length; 
//         int maker = 0;
        
//         for(int i=0; i<n; i++){
//             if(maker < i) return false;
//             maker = Math.max(maker, i+nums[i]);
//         }
//         return true;
        
        int LastGoodIdxPosiT = n-1;
        
        for(int i=n-1; i>=0; i--){
            if(i+nums[i] >= LastGoodIdxPosiT)
                LastGoodIdxPosiT = i;
        }
        return (LastGoodIdxPosiT == 0);
    }
}