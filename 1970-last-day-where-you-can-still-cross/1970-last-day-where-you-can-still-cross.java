class Solution {
    public int latestDayToCross(int row, int col, int[][] cells) {
        int day = 0, length = cells.length;
        int l = 0, r = length - 1;
        while(l <= r){
            int m = l+(r-l)/2;
            if(canReach(row, col, m, cells)){
                l = m + 1;
                day = m;
            } else r = m - 1;
        }
        return day;
    }
    
    private boolean canReach(int row, int col, int day, int[][] cells) {
        int[][] graph = new int[row][col];
        for(int i=0; i<day; ++i){
            int[] cur = cells[i];
            graph[cur[0] - 1][cur[1] - 1] = 1;
        }
        
        int r = graph.length, c = graph[0].length;
        List<Integer> zero = new ArrayList<>();
        for(int i=0; i<c; ++i)
            if(graph[0][i] == 0) zero.add(i);
        return this.hasValidPath(graph, zero);
    }
    
    private boolean hasValidPath(int[][] graph, List<Integer> zero) {
        int row = graph.length, col = graph[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(Integer i: zero){
            q.add(new int[]{0, i});
            graph[0][i] = 9;
        }
        
        int[][] dir = new int[][]{{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            if(cur[0] == row - 1) return true;
            for(int[] d: dir) {
                int newR = cur[0] + d[0], newC = cur[1] + d[1];
                if(newR >= 0 && newC >= 0 && newR < row 
                             && newC < col && graph[newR][newC] == 0){
                    q.offer(new int[]{newR, newC});
                    graph[newR][newC] = 9;
                }
            }
        }
        return false;
    }
}