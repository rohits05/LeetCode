class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++) set.add(nums[i]);
        
        return !(set.size() == nums.length); 
    }
}