class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int n =nums.length, sum =0, minLen =Integer.MAX_VALUE;
        int start =0, end =0;

        while(end < n){
            sum += nums[end];
            ++end;
        while(sum >= s){
              minLen = Math.min(minLen, end - start);
              sum -= nums[start];
              ++start;
           }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}