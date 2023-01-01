class Solution {
    public int findNumbers(int[] nums) {
        int ducky =0;
        for(int i=0; i<nums.length; i++) 
            if(Integer.toString(nums[i]).length() % 2 == 0) ducky++;
            
        return ducky;
    }
}