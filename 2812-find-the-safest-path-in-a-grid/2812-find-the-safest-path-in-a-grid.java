class Solution {
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int m = grid.size(), n = grid.get(0).size(), maxI = 100000;
        
        int[][] dist = new int[m][n];
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++) dist[i][j] = maxI;

        Queue<int[]> queue = new LinkedList<int[]>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid.get(i).get(j) == 1){
                    queue.add(new int[] {i, j});
                    dist[i][j] = 0;
                }
            }
        }
    
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            for(int[] d: dirs){
                int x = d[0] + cur[0], y = d[1] + cur[1];
                if(x>=0 && y>=0 && x<m && y<n && dist[x][y] == maxI){
                    dist[x][y] = dist[cur[0]][cur[1]] + 1;
                    queue.add(new int[] {x, y});
                }
            }
        }

        int left = 0, right = 400, res = 0;
        while(left <= right){
            int mid = (left + right) / 2;
            boolean[][] visited = new boolean[m][n];
            queue = new LinkedList<int[]>();
            boolean found = false;
            if(dist[0][0] >= mid){
                queue.add(new int[] {0, 0});
                visited[0][0] = true;
            }
            
            while(!queue.isEmpty()){
                int[] cur = queue.poll();
                if(cur[0] == m-1 && cur[1] == n-1){
                    found = true;
                    break;
                }
                
                for(int[] d: dirs){
                    int x = d[0] + cur[0], y = d[1] + cur[1];
                    if(x>=0 && y>=0 && x<m && y<n && !visited[x][y] && dist[x][y]>=mid){
                        visited[x][y] = true;
                        queue.add(new int[] {x, y});
                    }
                }
            }

            if(found){
                res = mid;
                left = mid+1;
            }else right = mid-1;
        }
        
        return res;
    }
}