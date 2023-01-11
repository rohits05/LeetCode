class Solution {
    public int minTime (int n, int[][] edges, List<Boolean> hasApple) 
    {
        ArrayList<ArrayList<Integer>> adjacencyList= new ArrayList<>();
        for(int i=0; i<n; i++) adjacencyList.add(new ArrayList<>());
        
        for(int []edge: edges){
            int u = edge[0], v = edge[1];
            adjacencyList.get(u).add(v);   
            adjacencyList.get(v).add(u);    
        }
        
        boolean visited[]= new boolean[n];
        return dfs(adjacencyList ,visited, hasApple, 0);
    }
    
    public int dfs (ArrayList<ArrayList<Integer>> adjacencyList, boolean visited[], List<Boolean> hasApple, int source)
    {
        visited[source] = true;
        
        int totalTime = 0;
        for(int vertex: adjacencyList.get(source)){
         if(visited[vertex] == false) totalTime += dfs(adjacencyList, visited, hasApple, vertex);
        }
        
        if(source != 0 && (hasApple.get(source) || totalTime > 0)) totalTime += 2;
        return totalTime;
    }
}