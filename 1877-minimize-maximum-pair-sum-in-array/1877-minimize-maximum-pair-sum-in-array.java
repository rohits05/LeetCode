class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxI = Integer.MIN_VALUE;
        int i = 0, j = nums.length - 1;
        
        while(i<j){
            maxI = Math.max(maxI, (nums[i++] + nums[j--]));
        }
        
        return maxI;
    }
}