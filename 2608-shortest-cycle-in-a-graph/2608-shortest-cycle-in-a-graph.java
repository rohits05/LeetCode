class Solution {
    public int findShortestCycle(int n, int[][] edges) {
        int minI = Integer.MAX_VALUE;
        List<Integer>[] adj = new List[n];
        
        for(int i=0; i<n; i++) adj[i] = new ArrayList<>();
        for(int[] edge: edges){
            int u = edge[0], v = edge[1];
            adj[u].add(v);
            adj[v].add(u);
        }

        for(int i=0; i<n; i++){
            int[] dist = new int[n];
            Arrays.fill(dist, -1);
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(i);
            dist[i] = 0;
            while(!queue.isEmpty()){
                int u = queue.poll();
                for(int v: adj[u]){
                    if(dist[v] == -1){
                        dist[v] = dist[u] + 1;
                        queue.offer(v);
                    }else if(v != i && dist[v] >= dist[u])
                        minI = Math.min(minI, dist[u] + dist[v] + 1);
                }
            }
        }

        return (minI == Integer.MAX_VALUE ? -1 : minI);
    }
}