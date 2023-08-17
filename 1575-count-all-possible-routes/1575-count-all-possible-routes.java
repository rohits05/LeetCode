class Solution {
    int mod = 1000000007;
    Integer[][] dp;
    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        int n = locations.length;
        dp = new Integer[n][fuel+1];
        return helper(start, finish, locations, fuel) % mod;
    }
    
    private int helper(int ind, int end, int[] locations, int fuel) {
        if(fuel < 0) return 0;
        if(dp[ind][fuel] != null) return dp[ind][fuel];
        
        int ans = ind == end? 1: 0;
        int n = locations.length;
        for(int i=0; i<ind; i++){
            ans += (helper(i, end, locations, 
                    fuel - Math.abs(locations[i] - locations[ind])) % mod);
            ans %= mod;
        }
        
        for(int i=ind+1; i<n; i++){
            ans += (helper(i, end, locations, fuel 
                    - Math.abs(locations[i] - locations[ind])) % mod);
            ans %= mod;
        }
        
        
        return dp[ind][fuel]  = ans % mod;
    }
}