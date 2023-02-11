class Solution {
    private static final int RED = 1, BLUE = -1, BOTH = 2, EMPTY = 0;

    void shortestPathStartingFrom(int[][] g, int n, int currentEdge, int[] ans) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {0, currentEdge, 0});
        
        Set<String> isVisited = new HashSet<>();

        while(q.size() != 0){
            int[] cur = q.poll();
            int curNode = cur[0];
            currentEdge = cur[1];
            int distance = cur[2];
            ans[curNode] = Math.min(ans[curNode], distance);

            for(int i=0; i<n; i++){
                if(!isVisited.contains(i + "," + -currentEdge) 
                   && (g[curNode][i] == -currentEdge || g[curNode][i] == BOTH)){
                    isVisited.add(i + "," + -currentEdge);
                    q.add(new int[] {i, -currentEdge, distance + 1});
                }
            }
        }
    }

    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        int[][] g = new int[n][n];

        for(int[] redEdge: redEdges) g[redEdge[0]][redEdge[1]] = RED;

        for(int[] blueEdge: blueEdges)
            g[blueEdge[0]][blueEdge[1]] = (g[blueEdge[0]][blueEdge[1]] == RED) ? BOTH : BLUE;

        int[] ans = new int[n];
        Arrays.fill(ans, Integer.MAX_VALUE);

        shortestPathStartingFrom(g, n, RED, ans);
        shortestPathStartingFrom(g, n, BLUE, ans);

        for(int i=1; i<n; i++)
            ans[i] = (ans[i] == Integer.MAX_VALUE) ? -1 : ans[i];

        return ans;
    }
}