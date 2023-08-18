class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int r = roads.length, ans = 0;
        int indegree[] = new int[n];
        int haveDirectEdge[][] = new int[n][n];
        
        for(int i=0; i<r; i++){
            int u = roads[i][0], v = roads[i][1];
            indegree[u]++;
            indegree[v]++;

            haveDirectEdge[u][v] = 1;
            haveDirectEdge[v][u] = 1;
        }
        
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++)
                ans = Math.max(ans, indegree[i] + indegree[j] - haveDirectEdge[i][j]);
        }
        
        return ans;
    }
}