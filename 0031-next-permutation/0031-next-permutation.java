class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length <= 1) return;
        // Break Point
        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i + 1]) i--;
        
        // If we get the break points
        if(i >= 0){
            int j = nums.length - 1;
            while( nums[j] <= nums[i]) j--;
            swap(nums , i , j);
        }
        //If no break point exists , Simply reverse the right half
        reverse(nums, i + 1, nums.length - 1);
    }
    
    public void swap(int[] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
                     
    public void reverse(int[] nums , int i , int j){
        while(i < j) swap(nums , i++ ,j--);
    }
  
}