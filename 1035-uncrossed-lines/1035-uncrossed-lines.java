class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int n =nums1.length, m =nums2.length;
        int[][] dp = new int[n+1][m+1];

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(nums1[i-1] == nums2[j-1]) dp[i][j] = dp[i-1][j-1] + 1;
                else dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
            }
        }

        return dp[n][m];
    }
}