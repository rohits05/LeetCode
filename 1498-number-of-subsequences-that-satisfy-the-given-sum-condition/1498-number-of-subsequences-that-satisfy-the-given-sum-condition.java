class Solution {
    public int numSubseq(int[] nums, int target) {
        int mod = (int) 1e9+7;
        Arrays.sort(nums);

        int n =nums.length;
        int[] power = new int[n];
        power[0] = 1;
        for(int i=1; i<n; ++i)
            power[i] = (power[i - 1] * 2) % mod;

        int start =0,end =nums.length-1, count=0;
        while(start <= end){
            if(nums[start] + nums[end] <= target){
                count += (power[end-start]);
                count %= mod;
                start++;
            }
            else end--;
        }
        
        return count%mod;
    }
}