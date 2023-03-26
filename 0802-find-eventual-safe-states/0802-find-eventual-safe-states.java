class Solution {
    public List<Integer> eventualSafeNodes(int[][] adj) {
        List<List<Integer>> adjRev = new ArrayList<>();
        List<Integer> ans = new LinkedList<>();
        int V = adj.length;
        for(int i=0; i<V; i++)
            adjRev.add(new ArrayList<>());

        int indegree[] = new int[V];
        for(int i=0; i<V; i++){
            for(int it: adj[i]){
                adjRev.get(it).add(i);
                indegree[i]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        List<Integer> safeNodes = new ArrayList<>();
        for(int i=0; i<V; i++){
            if(indegree[i] == 0) q.add(i);
        }

        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            safeNodes.add(node);
            for(int it: adjRev.get(node)){
                indegree[it]--;
                if (indegree[it] == 0) q.add(it);
            }
        }
        
        Collections.sort(safeNodes);
        return safeNodes;
    }
}