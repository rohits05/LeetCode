class Solution {
    public int shortestPath(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        if(k >= m+n-2) return m+n-2;
        
        int[][] dirs = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        boolean[][][] visited = new boolean[k+1][m][n];
        Queue<int[]> queue = new LinkedList();
        queue.offer(new int[] {k, 0, 0});
        visited[k][0][0] = true;
        var ans = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0; i<size; i++){ 
                int[] cur = queue.poll();
                int remainK = cur[0];
                int x = cur[1];
                int y = cur[2];
                
                if(x == m-1 && y == n-1) return ans;
                                                
                for(int[] dir : dirs){
                    int newX = x + dir[0];
                    int newY = y + dir[1];
                    if(newX >= 0 && newX < m && newY >= 0 && newY < n){
                        int newK = remainK;
                        if(grid[newX][newY] == 1){
                            newK -= 1;
                        }
                        if(newK >= 0 && visited[newK][newX][newY] == false){
                            visited[newK][newX][newY] = true;
                            queue.offer(new int[] {newK, newX, newY});
                        }
                    }
                }
            }
            ans += 1;
        } 
        return -1;
    }
}