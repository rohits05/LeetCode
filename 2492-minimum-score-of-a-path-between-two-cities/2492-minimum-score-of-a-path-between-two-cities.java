class Solution {
    public int minScore(int n, int[][] roads) {
        int ans = Integer.MAX_VALUE;
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<=n; i++) graph.add(new ArrayList<>());

        
        int dist[] = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        for(int[] road: roads){
            graph.get(road[0]).add(road[1]);
            graph.get(road[1]).add(road[0]);
            dist[road[0]] = Math.min(road[2], dist[road[0]]);
            dist[road[1]] = Math.min(road[2], dist[road[1]]);
        }

        Deque<Integer> deque = new ArrayDeque<>();
        boolean[] visited = new boolean[n + 1];
        visited[1] = true;
        deque.add(1);
        
        while(!deque.isEmpty()){
            int node = deque.pollFirst();
            for(int nei: graph.get(node)){
                if(!visited[nei]){
                    visited[nei] = true;
                    ans = Math.min(ans, dist[nei]);
                    deque.offerLast(nei);
                }
            }
        }
        
        return ans;
    }
}