class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> aam = new ArrayList<>();
        // Collections.sort(aam);
        
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]) aam.add(nums[i]);
        }
        return aam;
    }
}