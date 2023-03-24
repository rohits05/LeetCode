class Solution {
    public boolean isBipartite(int[][] graph) { 
        int[] colors = new int[graph.length];   

        for (int i=0; i<graph.length; i++) 
            if(colors[i] == 0)
                if(!dfs(graph, i, colors, 1)) return false;

         return true;
   }

    boolean dfs(int[][] graph, int v, int[] colors, int color) {
        colors[v] = color;

        for(int u: graph[v])  
            if(colors[u] == color || (colors[u] == 0 && 
                !dfs(graph, u, colors, color % 2 + 1))) return false;

        return true;
     }
}