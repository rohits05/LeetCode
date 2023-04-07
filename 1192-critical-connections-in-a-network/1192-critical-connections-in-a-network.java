class Solution {
    int[] parent;
    int[] discover;
    int[] low;
    int time;
    boolean[] visited;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList();
        for(int i=0; i<n; i++) graph.add(new ArrayList());
        
        for(int i=0; i<connections.size(); i++){
            int u = connections.get(i).get(0), v = connections.get(i).get(1);
            graph.get(u).add(v); graph.get(v).add(u);
        }
        
        parent = new int[n]; discover = new int[n]; low = new int[n];
        visited = new boolean[n]; time = 0;

        List<List<Integer>> ans = new ArrayList();
        Bridges(0, graph, ans);
        return ans;
    }
    
    // Bridges Connection ~ Using Tarjan's Algo !!
    public void Bridges(int u, ArrayList<ArrayList<Integer>> graph, List<List<Integer>> ans) {
        discover[u] = low[u] = time++;
        visited[u] = true;
        for(int i=0; i<graph.get(u).size(); i++){
            int v = graph.get(u).get(i);
            if(parent[u] == v) continue;
            else if(!visited[v]){
                parent[v] = u;
                Bridges(v, graph, ans);
                low[u] = Math.min(low[u], low[v]);
                if(low[v] > discover[u]) 
                    ans.add(List.of(u, v));
            }
            else  low[u] = Math.min(low[u], discover[v]);
        }
    }
}