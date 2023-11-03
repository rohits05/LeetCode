class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if(nums == null || n <= 1) return;
        
        int i = n-2;
        while(i >= 0 && nums[i] >= nums[i + 1]) i--; //break-point
        
        if(i >= 0){ // caught 
            int j = n-1;
            while(nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }
        reverse(nums, i+1, n-1);
    }
    
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
                     
    public void reverse(int[] nums, int i, int j) {
        while(i < j) swap(nums, i++, j--);
    }
}