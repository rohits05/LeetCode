class Solution {
    public int maximumDifference(int[] nums) {
        int min = nums[0], diff = -1;
        
        for(int i=1; i<nums.length; i++){
            if(nums[i] > min) diff = Math.max(diff, nums[i]-min);
            else min = nums[i];
        }
        
        return diff;
    }
}