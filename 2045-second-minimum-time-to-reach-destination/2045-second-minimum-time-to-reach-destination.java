class Solution {
    public int secondMinimum(int n, int[][] edges, int time, int change) {
        Map<Integer, Integer> fast = new HashMap<>();
        Map<Integer, Integer> second = new HashMap<>();
        
        Queue<int[]> Q = new ArrayDeque<>();
        Q.offer(new int[] {1, 0});
        fast.put(1, 0);
        Map<Integer, List<Integer>> G = new HashMap<>();
        int first = -1;
        
        for(int[] edge: edges){
            if(!G.containsKey(edge[0])) G.put(edge[0], new ArrayList<>());
            if(!G.containsKey(edge[1])) G.put(edge[1], new ArrayList<>());
            
            G.get(edge[0]).add(edge[1]);
            G.get(edge[1]).add(edge[0]);
        }

        while(!Q.isEmpty()){
            int[] p = Q.poll();
            int node = p[0], currTime = p[1];
            for(Integer next: G.get(node)){
                if(next == n){
                    if(first == -1) first = currTime + time;
                    else
                        if(currTime + time > first) return currTime + time;
                }

                int targetTime = currTime + time;
                if((targetTime / change) % 2 == 1)
                    targetTime = (targetTime / change + 1) * change;
                if(!fast.containsKey(next)){
                    fast.put(next, targetTime);
                    Q.offer(new int[] {next, targetTime});
                    continue;
                }
                
                if(!second.containsKey(next) && fast.get(next) < targetTime){
                    second.put(next, targetTime);
                    Q.offer(new int[] {next, targetTime});
                    continue;
                }
            }
        }
        
        return -1;
    }
}