class Solution {
    int ans;
    public int longestPath(int[] parent, String s) {
        int n = parent.length;
        List<List<Integer>> store = new ArrayList<>();
        for(int i=0; i<n; i++) store.add(new ArrayList<Integer>());

        for(int i=1; i<n; i++) store.get(parent[i]).add(i);
        ans = Integer.MIN_VALUE;
        dfs(store, 0, s);
        return ans;
    }
    
    public int dfs(List<List<Integer>> graph, int curr, String s) {
        int max1 = 0, max2 = 0;
        for(int i: graph.get(curr)){
            int st = dfs(graph, i, s);
            if(s.charAt(curr) != s.charAt(i))
				if(st>max1){
					max2 = max1;
					max1 = st;
				}else if(st > max2) max2 = st;
        }
        ans = Math.max(max1+max2+1, ans);
        return max1+1;
    }
}