class Solution {
    public void moveZeroes(int[] nums) {
        int nonZ =0, i =0;
        
        while(i < nums.length){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[nonZ];
                nums[nonZ] = temp;
                nonZ++;
            }
            i++;
        }
    }
}