class Solution {
    public int countHillValley(int[] nums) {
        int pick =nums[0], cnt =0;
        
        for(int i=1; i<nums.length-1; i++){
            if(nums[i] > nums[i + 1] && pick < nums[i] || 
               nums[i] < nums[i + 1] && pick > nums[i]){
                cnt++;
                pick = nums[i];
            }
        }
        return cnt;
    }
}