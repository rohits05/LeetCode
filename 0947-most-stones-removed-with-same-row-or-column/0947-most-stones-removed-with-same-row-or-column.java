class Solution {
   public int removeStones(int[][] stones) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int[] stone: stones){
            graph.computeIfAbsent(stone[0], k -> new ArrayList<>()).add(~stone[1]);
            graph.computeIfAbsent(~stone[1], k -> new ArrayList<>()).add(stone[0]);
        }
       
        int numOfComponent = 0;
        Set<Integer> visited = new HashSet<>();
        for(int[] stone : stones){
            for(int i=0; i<2; i++){
                int s=i==0 ? stone[0] : ~stone[1];
                if(!visited.contains(s)){
                    numOfComponent++;
                    dfs(s, graph, visited);
                }
            } 
        }
        return stones.length - numOfComponent;
    }
    
    private void dfs(int stone, Map<Integer, List<Integer>> graph, Set<Integer> visited) {
        if(visited.add(stone)){
            for(int next: graph.get(stone)){
                dfs(next, graph, visited);
            }
        }
    }
}