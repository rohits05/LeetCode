class Solution {
    public int minPathSum(int[][] grid) {
        int n =grid.length, m =grid[0].length;
        
//         if(grid == null || m == 0 || grid[0] == null || n == 0) 
//             return Integer.MIN_VALUE;
//         for(int i=1; i<m; i++) grid[i][0] = grid[i][0] + grid[i-1][0];
//         for(int j=1; j<n; j++) grid[0][j] = grid[0][j] + grid[0][j-1];
        
//         for(int i=1; i<m; i++){
//             for(int j=1; j<n; j++) 
//                 grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
//         }
//         return grid[m - 1][n - 1];
        
        // Spcae OptimizaTion !1
        int[] prev = new int[m];
        Arrays.fill(prev, 0);
        
        for(int i=0; i<n; i++){
            int[] curr = new int[m];
            Arrays.fill(curr, 0);
            for(int j=0; j<m; j++){
                if(i == 0 && j == 0) curr[j] = grid[i][j];
                else{
                    int up = grid[i][j];
                    if(i > 0) up += prev[j];
                    else up += 100000;

                    int left = grid[i][j];
                    if(j > 0) left += curr[j-1];
                    else left += 100000;

                    curr[j] = Math.min(up, left);
                }
            }
            prev = curr;
        }
        return prev[m-1];
    }
}