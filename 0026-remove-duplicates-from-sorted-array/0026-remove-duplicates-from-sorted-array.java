class Solution {
    public int removeDuplicates(int[] nums) {
        int idx =1, n =nums.length;
        for(int i=0; i<n-1; i++) if(nums[i] != nums[i+1]) nums[idx++] = nums[i+1];
        return idx;
    }
}