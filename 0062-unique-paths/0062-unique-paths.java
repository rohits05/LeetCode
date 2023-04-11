class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n]; // Tabulation ! TC: O(MxN) | SC: O(MxN)
        dp[0][0] = 1;
//      int prev[] = new int[n]; // Space opTimizinG !
        
        for(int i=0; i<m; i++){
            // int temp[] = new int[n];
            for(int j=0; j<n; j++){
                if(i ==0 && j== 0) 
                    // temp[j] = 1;
                    dp[i][j] = 1; // Base case
                else{
                    int up =0, left =0; // bottom - up movement !
                    // checks for valid moves
                    if(i > 0) up = dp[i-1][j]; 
                    if(j > 0) left = dp[i][j-1];
                    
                    // Summing Up!
                    dp[i][j] = up + left;
        
//                     int up =0, left =0;
//                     if(i > 0) up = prev[j];
//                     if(j > 0) left = temp[j-1];
//                     temp[j] = up + left;
                }
//                 prev = temp;
            }
        }
        return dp[m-1][n-1];
        // return prev[n-1];
        
        // OpTimal - G !
//         int f = n - m - 2;
//         int s = m - 1;
//         double ans = 1;
        
//         for(int i=1; i<=s; i++){
//             ans = ans * (f - s + i)/i;
//         }
//         return (int)ans;
    }
}