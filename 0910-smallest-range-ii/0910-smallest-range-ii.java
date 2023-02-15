class Solution {
    public int smallestRangeII(int[] nums, int k) {
        int len = nums.length;
        Arrays.sort(nums);
        
        int resulT = nums[len-1] - nums[0], minI = nums[0] + k, maxI = nums[len-1] - k;  
        for(int i=0; i<len-1; i++){
            int maxRes = Math.max(maxI, nums[i] + k), minRes = Math.min(minI, nums[i+1] - k);
            resulT = Math.min(resulT, maxRes - minRes);
        }
        
        return resulT;
    }
}