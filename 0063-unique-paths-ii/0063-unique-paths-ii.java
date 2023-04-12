class Solution {
    public int uniquePathsWithObstacles(int[][] dp) {
        int m = dp.length, n = dp[0].length;
        int prev[] = new int[n]; // Space OpTimization | O(MxN) | O(N)
        
        for(int i=0; i<m; i++){
            int curr[] = new int[n];
            
            for(int j=0; j<n; j++){
                if(dp[i][j] == 1) curr[j] = 0; // Real - Twitch!
                
                // As Similar to Unique paths I
                else if(i == 0 && j == 0) curr[j] = 1;
                else{
                    int up = 0, left =0; // movements
                    if(i > 0) up = prev[j]; // checkin' valid moves
                    if(j > 0) left = curr[j-1];

                    curr[j] = up + left;
                }
            }
            prev = curr;
        }

        return prev[n-1]; // The final grid path 1
    }
}