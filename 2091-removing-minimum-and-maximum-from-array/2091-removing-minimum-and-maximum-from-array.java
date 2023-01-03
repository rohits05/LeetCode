class Solution {
    public int minimumDeletions(int[] nums) {
        int minIndex = nums.length - 1, maxIndex = 0;
        int maxValue = Integer.MIN_VALUE, minValue = Integer.MAX_VALUE;
        for(int index=0; index < nums.length; index++){
            if(nums[index] < minValue){
                minValue = nums[index];
                minIndex = index;
            }
            
            if(nums[index] > maxValue){
                maxValue = nums[index];
                maxIndex = index;
            }
        }
        
        if(minIndex == maxIndex){
            return Math.min(nums.length - minIndex, minIndex + 1);
        }else{
            if(minIndex > maxIndex){
                int swapHelper = minIndex;
                minIndex = maxIndex;
                maxIndex = swapHelper;
            }
            return Math.min(
                Math.min(
                    Math.max(minIndex + 1, maxIndex + 1),
                    Math.max(nums.length - minIndex, nums.length - maxIndex)
                ),
                nums.length - maxIndex + 1 + minIndex
            );
        }
    }
}