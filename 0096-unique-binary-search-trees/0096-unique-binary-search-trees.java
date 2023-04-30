class Solution {
    private Integer[] dp = new Integer[20];
    public int numTrees(int n) {
        if(n==0 || n==1) return 1;
        if(dp[n] != null) return dp[n];

        int ans = 0;
        for(int i=n-1; i>=0; i--)
            ans += (numTrees(i) * numTrees(n-1-i));
        
        return dp[n] = ans;
    }
}