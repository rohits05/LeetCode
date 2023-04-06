class Solution {
    private boolean dfs(int[][] grid, int i, int j, int m, int n) {
        if(i<0 || i>=m || j<0 || j>=n) return false;

        if(grid[i][j] == 1) return true;
        grid[i][j] =1;
        
        boolean up = dfs(grid, i-1, j, m, n);
        boolean down = dfs(grid, i+1, j, m, n);
        boolean left = dfs(grid, i, j-1, m, n);
        boolean right = dfs(grid, i, j+1, m, n);
        return (up && down && left && right);
    }
    
    public int closedIsland(int[][] grid) {
        int m =grid.length, n =grid[0].length, count =0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 0)
                    if (dfs(grid, i, j, m, n)) count++;
            }
        }
        return count;
    }
}