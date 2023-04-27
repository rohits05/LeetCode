class Solution {
    public int maxProfit(int K, int[] A) {
        // if(N == 0 || N == 1) return 0;
        // int dp[][] = new int[K+1][N];
        
        // for(int i=1; i<=K; i++){
        //     int maxdiff = 0 - A[0];
        //     for(int j=1; j<N; j++){
        //         dp[i][j] = Math.max(dp[i][j-1], A[j] + maxdiff);
        //         maxdiff = Math.max(maxdiff, dp[i-1][j] - A[j]);
        //     }
        // }
        
        // return dp[K][N-1];
        
        // Space . OpTimizeD!
        int N = A.length;
        int []p = new int[2*K+1]; 
        int []c = new int[2*K+1];
        
        for(int i=N-1; i>=0; i--){
            for(int j=2*K-1; j>=0; j--){
                
                if(j % 2 == 0) c[j] = Math.max(p[j+1] - A[i], p[j]); // Buy 1
                else c[j] = Math.max(A[i] + p[j+1], p[j]);
            }
            p = c;
        }
        return p[0];
    }
}