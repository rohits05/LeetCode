class Solution {
    public int findDuplicate(int[] nums) {
        // Arrays.sort(nums);
        
        // for (int i=1; i < nums.length; i++) {
        //     if (nums[i] == nums[i - 1]) {
        //         return nums[i];
        //     }
        // }
        // return nums.length;
        
        //Better Approach
        Set<Integer> val = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(!val.add(nums[i]))  
                return nums[i];
        }
        return nums.length;
    }
}