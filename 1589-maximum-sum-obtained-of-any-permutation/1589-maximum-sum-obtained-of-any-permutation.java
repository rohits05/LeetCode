class Solution {
    public int maxSumRangeQuery(int[] nums, int[][] requests) {
        int n = nums.length;
        int[] res = new int[n];
        
        for(int i=0; i<requests.length; i++){
            res[requests[i][0]]++;
            if(requests[i][1]+1<n) res[requests[i][1]+1]--;
        }
        for(int i=1; i<n; i++) res[i] += res[i-1];
    
        Arrays.sort(nums); Arrays.sort(res);
        long ans = 0, mod = 1000000007;
        for(int i=0; i<n; i++){
            ans += ((long)res[i]*nums[i]);
            ans %= mod;
        }
        return (int)(ans%mod);
    }
}