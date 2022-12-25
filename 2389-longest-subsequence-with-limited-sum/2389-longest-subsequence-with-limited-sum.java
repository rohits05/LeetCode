class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
		int[] res = new int[queries.length];
//         // int count =0, sum =0, j=0;
        
//         for(int i=0, count =0, sum =0, j=0; i<queries.length; i++, count =0, sum =0, j=0){
//             while(j < nums.length && sum + nums[j] <= queries[i]) {
//                 sum += nums[j++];
//                 count++;
//             }
//             res[i] = count;
//         }
        
//         return res;
        
        // Prefix - Sum Technique !!
        TreeMap<Integer, Integer> treeMap = createTreeMap(nums);
        
        for(int i=0; i<queries.length; i++) {
            Integer floorKey = treeMap.floorKey(queries[i]);
            if(floorKey != null) res[i] = treeMap.get(floorKey);
        }

        return res;
    }
    
    public TreeMap<Integer, Integer> createTreeMap(int[] nums) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        
        for(int i=0, sum=0; i<nums.length; i++){
            sum += nums[i];
            treeMap.put(sum, i+1);
        }
        
        return treeMap;
    }
}