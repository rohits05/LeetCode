class Solution {
    List<List<int[]>> adj;
    public int minReorder(int n, int[][] connections) {
        adj = new ArrayList<>();
        for(int i=0; i<n;i++) adj.add(new ArrayList<>());
        for(var c: connections){
            adj.get(c[0]).add(new int[]{c[1], 1});
            adj.get(c[1]).add(new int[]{c[0], 0});
        }
        return dfs(0, -1);
    }
    
    int dfs(int n,int p){
        int ans = 0;
        for(var a:adj.get(n))
            if(a[0] != p) ans += a[1] + dfs(a[0],n);
        return ans;
    }
}