class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max =0, sum =0;
        int i =0, j =0, n =nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        
        while(j < n){
            sum += nums[j];
            if(!map.containsKey(nums[j])) map.put(nums[j], 0);
            map.put(nums[j], map.get(nums[j]) + 1);
            
            if(j - i + 1 < k) j++;
            else{
                if(map.size() == k && sum>max) max = sum;
                sum -= nums[i];
                map.put(nums[i], map.get(nums[i])-1);
                if(map.get(nums[i]) == 0) map.remove(nums[i]);
                i++; j++;
            }
        }
        
        return max;
    }
}