class Solution {
    public int sumOfBeauties(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        
        for(int i=1; i<nums.length; i++)
            prefix[i] = Math.max(nums[i], prefix[i-1]);
        
        int[] suffix = new int[nums.length];
        suffix[suffix.length-1] = nums[nums.length-1];
        
        for(int i=suffix.length-2; i>=0; i--)
            suffix[i] = Math.min(nums[i], suffix[i+1]);
        
        int beauty = 0;
        for(int i=1; i<=nums.length-2; i++){
            if(nums[i] > prefix[i-1] && nums[i] < suffix[i+1]) beauty += 2;
            else if(nums[i] > nums[i-1] && nums[i] < nums[i+1]) beauty++;
        }
        
        return beauty;
    }
}