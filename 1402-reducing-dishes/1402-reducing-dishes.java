class Solution {
        public int f(int[] s, int i, int n, int[][] dp) {
        if(i == s.length) return 0;
        if(dp[i][n] != -1) return dp[i][n];
        
        int pick = (s[i]*n) + f(s, i+1, n+1, dp);
        int notpick = f(s, i+1, n, dp);
        
        return dp[i][n] = Math.max(notpick, pick);
    }
    
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int[][] dp = new int[satisfaction.length][satisfaction.length+1];
        
        int i =0;
        for(int[] a: dp){
            Arrays.fill(a, -1);
            dp[i] = a;
            i++;
        }
        
        return f(satisfaction, 0, 1, dp);
    }
}