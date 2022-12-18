class Solution {
    public int minMaxGame(int[] nums) {
        return recursion(nums);
    }
    
    public int recursion(int nums[]){
        if(nums.length == 1) return nums[0];
        int[] temp = new int[nums.length/2];
        int count = 0, index = 0;
         
        for(int i=0; i<nums.length-1; i+=2){
            if(count%2 == 0) temp[index] = Math.min(nums[i], nums[i+1]);
            else temp[index] = Math.max(nums[i], nums[i+1]);
            count++;
            index++;
        }
        
        return recursion(temp);
    }
}