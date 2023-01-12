class Solution {
    private int [] ans;
    private ArrayList<ArrayList<Integer>> adjList;
    private Set<Integer> visited;
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        ans = new int[n];
        adjList = new ArrayList<>(n);

        for(int i=0; i<n; i++) adjList.add(new ArrayList<>());

        for(int [] edge: edges){
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        visited = new HashSet<Integer>(n);
        dfs(0, labels);
        return ans;
    }

    private int [] dfs(int node, String labels){
        visited.add(node);
        int [] count = new int[26];
        
        for(int adj: adjList.get(node)){
            if(!visited.contains(adj)){
                int [] adjCount=dfs(adj,labels);
                for(int i=0; i<26; i++){
                    count[i] += adjCount[i];
                }
            }
        }
        char ch = labels.charAt(node);
        count[ch-'a']++;
        ans[node] = count[ch-'a'];

        return count;
    }
}