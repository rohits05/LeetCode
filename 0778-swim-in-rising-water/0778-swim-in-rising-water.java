class Solution {
    int n;
    public int swimInWater(int[][] grid) {
        n =grid.length;
        boolean[][] vis = new boolean[n][n];
        int start =0, end =n*n-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(dfs(0, 0, vis, grid, mid)) end = mid-1;
            else start = mid+1;
            vis = new boolean[n][n];
        }
        return start;
    }

    private boolean dfs(int i, int j, boolean[][] vis, int[][] grid, int maxTime) {
        if(i<0 || i>=n || j<0 || j>=n || vis[i][j] || grid[i][j]>maxTime) return false;
        if(i==n-1 && j==n-1) return true;
        vis[i][j] = true;
        
        for(int x=0; x<4; x++){
            if(dfs(i, j+1, vis, grid, maxTime)) return true;
            if(dfs(i, j-1, vis, grid, maxTime)) return true;
            if(dfs(i+1, j, vis, grid, maxTime)) return true;
            if(dfs(i-1, j, vis, grid, maxTime)) return true;
        }
        return false;
    }
}

