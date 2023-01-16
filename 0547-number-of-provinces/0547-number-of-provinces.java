class Solution {
    public int findCircleNum(int[][] isConnected) {
        int ans =0, n =isConnected.length;
        boolean[] visited = new boolean[n + 1];
        
        for(int i=1; i<=n; i++){
            if(!visited[i]){
                dfs(isConnected, visited, i, n);
                ans++;
            }
        }
        
        return ans;
    }
    
    static void dfs(int[][] isConnected, boolean[] visited, int source, int n) {
        visited[source] =true;
        for(int k=0; k<n; k++){
            if(source - 1 != k){ //Connected & still not visited
                if(isConnected[source - 1][k] == 1 && !visited[k + 1])  
                    dfs(isConnected, visited, k+1, n);
            }
        }
    }
}