class Solution {
    public int numEnclaves(int[][] grid) {
        // Your code here
        // int n = grid.length, int m = grid[0].length;
        // int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
        // boolean[][] vis = new boolean[n][m];
        // Queue<int[]> q = new LinkedList<>();
        // //traversing through boundaries
        // for(int j=0; j<m; j++){
        //     if(!vis[0][j] && grid[0][j] == 1) q.add(new int[]{0,j});
        //     if(!vis[n-1][j] && grid[n-1][j] == 1) q.add(new int[]{n-1,j});
        // }
        
        // for(int i=0;i<n;i++){
        //     if(!vis[i][0] && grid[i][0] == 1) q.add(new int[]{i,0});
        //     if(!vis[i][m-1] && grid[i][m-1] == 1) q.add(new int[]{i,m-1});
        // }
        
        // while(!q.isEmpty()){
        //     int[] temp = q.poll();
        //     vis[temp[0]][temp[1]] = true;
        //     for(int[] d : dir){
        //         int i = temp[0] + d[0];
        //         int j = temp[1] + d[1];
        //         if(i>= 0 && j >= 0 && i <n && j < m && !vis[i][j] && grid[i][j] == 1)
        //             q.add(new int[]{i,j});
        //     }
        // }
        
        // int ans = 0;
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         if(!vis[i][j] &&grid[i][j] == 1) ans++;
        //     }
        // }
        
        // return ans;
        
        // DFS!!
        int n = grid.length, m = grid[0].length;
        for(int j=0;j<m;j++){
            if(grid[0][j] == 1) dfs(grid,0,j);
            if(grid[n-1][j] == 1) dfs(grid,n-1,j);
        }
        
        for(int i=0;i<n;i++){
            if(grid[i][0] == 1) dfs(grid,i,0);
            if(grid[i][m-1] == 1) dfs(grid,i,m-1);
        }
        
        int ans = 0; // ResT portions!!
        for(int i=0; i<=n-1; i++){
            for(int j=0; j<=m-1; j++){
                if(grid[i][j] == 1) ans++;
            }
        }
        
        return ans;
    }
    
    static int[][] dirN = {{-1,0},{0,1},{1,0},{0,-1}};
    public void dfs(int[][] grid,int i,int j){
        grid[i][j] = 0;
        
        for(int[] dir: dirN){
            int r = i+dir[0], c = j+dir[1];
            if(r>=0 && c>=0 && r<grid.length && c<grid[0].length && grid[r][c]==1)
                dfs(grid,r,c);
        }
    }
}