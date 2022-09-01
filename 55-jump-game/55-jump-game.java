class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length; 
        int maker = 0;
        
        for(int i=0; i<n; i++){
            if(maker < i) return false;
            maker = Math.max(maker, i+nums[i]);
        }
        return true;
    }
}