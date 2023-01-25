class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        HashMap<Integer,Integer> adj = new HashMap<>();
        for(int i=0 ; i<n; i++) if(edges[i] != -1) adj.put(i, edges[i]);

        int[] ans1 = new int[n];
        int[] ans2 = new int[n];
        Arrays.fill(ans1, Integer.MAX_VALUE);
        Arrays.fill(ans2, Integer.MAX_VALUE);
        dfs1(node1, 0,adj, ans1, new int[n]);
        dfs2(node2, 0, adj, ans2, new int[n]);
        int min = Integer.MAX_VALUE, res = -1;
        for(int i=0; i<n; i++){
            if(ans1[i] != Integer.MAX_VALUE && ans2[i] != Integer.MAX_VALUE){
                int val = Math.max(ans1[i], ans2[i]);
                if(val < min){
                    min = val;
                    res = i;
                }
            }
        }
        return res;
    }
    
    public void dfs1(int node , int steps , HashMap<Integer,Integer> adj , int[] ans , int[] vis){
        if(!adj.keySet().contains(node)){
            ans[node] = steps;
            vis[node] = 1;
            return;
        }

        if(vis[node] != 1){
            ans[node] = steps;
            vis[node] = 1;
            dfs1(adj.get(node), steps+1, adj, ans, vis);
        }

    }
    
    public void dfs2(int node , int steps , HashMap<Integer,Integer> adj , int[] ans , int[] vis){
        if(!adj.keySet().contains(node)){
            ans[node] = steps;
            vis[node] = 1;
            return;
        }

        if(vis[node] != 1){
            ans[node] = steps;
            vis[node] = 1;
            dfs1(adj.get(node), steps+1, adj, ans, vis);
        }
    }
}