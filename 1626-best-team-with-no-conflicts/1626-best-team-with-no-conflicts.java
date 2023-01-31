class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
         int n=ages.length;
         int pair[][] = new int[n][2];
         for(int i=0; i<n; i++){
             pair[i][0] =ages[i];
             pair[i][1] =scores[i];
         }  

         Arrays.sort(pair, (a,b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
         int dp[][] = new int[n][n+1];
         for(int []row: dp) Arrays.fill(row, -1);

         return backtrack(0, -1, dp, pair, n);
    }
    
    public int backtrack(int ind,int prev,int dp[][],int pair[][],int n){
        if(ind==n) return 0;
        if(dp[ind][prev+1] != -1) return dp[ind][prev+1];

        int len = backtrack(ind+1, prev, dp, pair, n);
        if(prev == -1 || pair[ind][1] >= pair[prev][1])
            len=Math.max(len, pair[ind][1] + backtrack(ind+1, ind, dp, pair, n));

        return dp[ind][prev+1] = len;
    }
}