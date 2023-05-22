class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        int n =nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<n; i++) mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
    
        List<Map.Entry<Integer, Integer>> lis = new LinkedList<Map.Entry<Integer, Integer>>(mp.entrySet());
        Collections.sort(lis, (a, b) -> b.getValue() - a.getValue());
        
        for(int j=0; j<k; j++) res[j] = lis.get(j).getKey();
        return res;
    }
}