class Solution {
    public int removeDuplicates(int[] nums) {
        int idx =1, n =nums.length;
        for(int i=2; i<n; i++)
            if(nums[i] != nums[idx-1]) nums[++idx] = nums[i];
        return idx+1;
    }
}