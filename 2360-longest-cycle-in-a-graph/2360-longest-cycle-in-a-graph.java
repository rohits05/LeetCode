class Solution {
    public static void dfs(int node, HashMap<Integer, ArrayList<Integer>> adj, Stack<Integer> stack, boolean[] isVis){
        isVis[node] = true;
        for(int it: adj.get(node))
            if(!isVis[it]) dfs(it, adj, stack, isVis);
        
        stack.push(node);
    }
    
    public static void revDfs(int node, HashMap<Integer, ArrayList<Integer>> transpose, int[] scc, boolean[] isVis){
        isVis[node] = true;
        scc[0]++;
        for(int it: transpose.get(node))
            if(!isVis[it]) revDfs(it, transpose, scc, isVis);
    }
    
    public int longestCycle(int[] edges) {
        int n = edges.length;
        HashMap<Integer, ArrayList<Integer>> adj = new HashMap();
        for(int i=0; i<n; i++)
            adj.put(i, new ArrayList());
        
        for(int i=0; i<edges.length; i++)
            if(edges[i] != -1) adj.get(i).add(edges[i]);
        
        boolean[] isVis = new boolean[n];
        Stack<Integer> stack = new Stack();
        for(int i=0; i<n; i++){
            if(!isVis[i]) dfs(i, adj, stack, isVis);
        }
        
        HashMap<Integer, ArrayList<Integer>> transpose=new HashMap<>();
        
        for(int i=0; i<n; i++)
            transpose.put(i, new ArrayList());
        
        for(int i=0; i<n; i++){
            isVis[i] = false;
            if(edges[i] != -1)
            transpose.get(edges[i]).add(i);
        }
        
        int res = 0;
        while(!stack.isEmpty()){
            int node = stack.pop();
            if(!isVis[node]){
                int[] count = new int[1];
                count[0] = 0;
                revDfs(node, transpose, count, isVis);
                res=Math.max(res, count[0]);
            }
        }
        
        return res==1?-1:res;
    }
}