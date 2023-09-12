class Solution {
    public int shortestPathAllKeys(String[] grid) {
        int m =grid.length, n =grid[0].length(), allKeys =0;
        int[] start = null;
        char[][] g = new char[m][n];
        
        for(int i=0; i<m; i++){
            g[i] = grid[i].toCharArray();
            for(int j=0; j<n; j++){
                if(g[i][j] == '@') start = new int[]{i, j};
                else if (g[i][j]>='a' && g[i][j]<='f') allKeys |= 1 << (g[i][j]-'a');
            }
        }
        
        int[][][] dist = new int[m][n][1 << 6];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++) Arrays.fill(dist[i][j], -1);
        }
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start[0], start[1], 0});
        dist[start[0]][start[1]][0] = 0;
        
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            int x = curr[0], y = curr[1], keys = curr[2];
            
            if(keys == allKeys) return dist[x][y][keys];
            for (int[] dir: dirs){
                int nx = x + dir[0], ny = y + dir[1];
                
                if(nx>=0 && nx<m && ny>=0 && ny<n && g[nx][ny]!='#'){
                    char c = g[nx][ny];
                    int newKeys = keys;
                    
                    if(c>='a' && c<='f') newKeys |= 1 << (c - 'a');
                    if(c>='A' && c<='F' && ((keys >> (c-'A'))&1) == 0) continue;
                    
                    if(dist[nx][ny][newKeys] == -1){
                        dist[nx][ny][newKeys] = dist[x][y][keys] + 1;
                        queue.offer(new int[]{nx, ny, newKeys});
                    }
                }
            }
        }
        
        return -1;
    }
}