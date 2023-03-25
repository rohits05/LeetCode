class Solution {
    int count =1;
    void dfs(int u, ArrayList<ArrayList<Integer>> map, boolean visited[]) {
        visited[u] = true;
        for(int v: map.get(u)){
            if(!visited[v]){
                count++;  
                dfs(v, map, visited);
            }
        }
    }
    public long countPairs(int n, int[][] edges) {
        long totalSum =0, sum =0;

        ArrayList<ArrayList<Integer>> map = new ArrayList<>();
        boolean visited[]=new boolean[n];
        for(int i=0; i<n; i++) map.add(new ArrayList<>());

        for(int edge[]: edges){
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }

        for(int i=0; i<n; i++){
            if(!visited[i]){
                count =1;
                dfs(i, map, visited);
                totalSum += (sum*count);
                sum += count;
            }
        }
        
        return totalSum;
    }
}