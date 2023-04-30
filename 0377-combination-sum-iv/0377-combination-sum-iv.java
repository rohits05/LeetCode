class Solution {
    public int combinationSum4(int[] nums, int target) {
         return helper(nums, target, new HashMap<Integer, Integer>());
    } 
    
    private int helper(int[] nums, int target, Map<Integer, Integer> map) {
        if(target < 0) return 0;
        if(target == 0) return 1;
        
        if(map.containsKey(target)) return map.get(target);
        int res =0;
        
        for(int i=0; i<nums.length; i++){
            int cnt = helper(nums, target - nums[i], map);
            if(target >= nums[i])  map.put(target - nums[i], cnt);
            res += cnt;
        }
        
        return res;
    }    
}