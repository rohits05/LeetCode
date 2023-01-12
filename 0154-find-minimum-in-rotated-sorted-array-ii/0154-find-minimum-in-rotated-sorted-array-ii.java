class Solution {
    public int findMin(int[] nums) {
        int minI = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < minI) minI = nums[i];
        }
        return minI;
    }
}