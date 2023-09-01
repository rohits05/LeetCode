class Solution {
    public void moveZeroes(int[] nums) {
        int nonZ =0, n =nums.length;
    
        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[nonZ];
                nums[nonZ] = temp;
                // swap(nums, i, nonZ);
                nonZ++;
            }
        }
    }
    
    private void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}