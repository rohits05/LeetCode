class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int res[] = new int[2];
        
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++){
            if(mp.containsKey(target - nums[i])){
                res[0] = mp.get(target - nums[i]); // val
                res[1] = i; // idx
                return res;
            }
            mp.put(nums[i], i); // curr val & idx
        }
        
        return res;
    }
}