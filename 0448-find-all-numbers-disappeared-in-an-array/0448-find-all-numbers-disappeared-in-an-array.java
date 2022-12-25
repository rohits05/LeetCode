class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappear = new ArrayList<Integer>();
        
        Set<Integer> numbers = new HashSet<Integer>();
        // for(int i=0; i<nums.length ; i++) numbers.add(nums[i]);
        for(int i: nums)numbers.add(i);
        
        for(int i=1; i<=nums.length; i++)
            if(!(numbers.contains(i))) disappear.add(i);
        
        return disappear;
    }
}