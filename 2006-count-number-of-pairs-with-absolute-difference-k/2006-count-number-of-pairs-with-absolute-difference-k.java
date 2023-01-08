class Solution {
    public int countKDifference(int[] nums, int k) {
        int res = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        
        for(int items: nums){
            mp.put(items, mp.getOrDefault(items, 0)+1);
			res += mp.getOrDefault(items - k, 0) + mp.getOrDefault(items + k, 0);
        }
        return res;
    }
}