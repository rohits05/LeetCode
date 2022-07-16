class Solution {
        private int[][] dirs = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        private int mod = 1000000000 + 7;

        public int findPaths(int m, int n, int N, int i, int j) {
            Long[][][] memo = new Long[m][n][N+1];
            return (int) dfs(m, n, N, i, j, memo);
        }

        public long dfs(int m, int n, int N, int i, int j, Long[][][] memo) {
            if (i < 0 || i >= m || j < 0 || j >= n)
                return 1;
            
            if (N == 0) 
                return 0;
            if (memo[i][j][N] != null) 
                return memo[i][j][N];
            
            memo[i][j][N] = null;
            for (int dir[] : dirs) {
                int x = dir[0] + i;
                int y = dir[1] + j;
                long val = memo[i][j][N] ==null ? 0 :memo[i][j][N];
                memo[i][j][N] = (val + dfs(m, n, N - 1, x, y, memo)) % mod;
            }
            
            return memo[i][j][N];
        }
}