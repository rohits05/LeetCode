class Solution {
    public int countPaths(int[][] grid) {
        int mod = 1000000007, ans = 0;
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        
        int n = grid.length, m = grid[0].length;
        int[][] dp = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int temp = helper(i, j, n, m, dp, dx, dy, grid);
                temp %= mod; ans += temp; ans %= mod;
            }
        }
        return ans;
    }
    
    public int helper(int r, int c, int n, int m, int[][] dp, int[] dx, int[] dy, int[][] grid){
        int mod = 1000000007;
        if(dp[r][c] != 0) return dp[r][c];
        
        int ans = 1;
        for(int i=0; i<4; i++){
            int x = c + dx[i], y = r + dy[i];
            
            if(x >= 0 && y >= 0 && x < m && y < n && grid[r][c] < grid[y][x]){
                    int temp = helper(y, x, n, m, dp, dx, dy, grid);
                    temp %= mod; ans += temp; ans %= mod;
            }
        }
        return dp[r][c] = ans;
    }
}