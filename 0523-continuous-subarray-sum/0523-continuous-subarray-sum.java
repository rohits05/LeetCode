class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            res += nums[i];
            res %= k; 
            if (res == 0 && i > 0) return true;
            if (map.containsKey(res) && i - map.get(res) > 1) return true;
            if (!map.containsKey(res)) map.put(res, i);   
        }
        return false;
    }
}