class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
		int[] res = new int[queries.length];
        // int count =0, sum =0, j=0;
        
        for(int i=0, count =0, sum =0, j=0; i<queries.length; i++, count =0, sum =0, j=0){
            while(j < nums.length && sum + nums[j] <= queries[i]) {
                sum += nums[j++];
                count++;
            }
            res[i] = count;
        }
        
        return res;
    }
}