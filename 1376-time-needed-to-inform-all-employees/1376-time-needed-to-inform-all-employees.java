class Solution {
    Map<Integer,List<Integer>> graph;
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        this.graph = new HashMap<>();

        for(int i=0; i<n; i++){
            int empl =i, mgrx =manager[i];
            if(mgrx == -1) continue;
            graph.putIfAbsent(mgrx, new ArrayList<>());
            graph.get(mgrx).add(empl);
        }

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{headID, 0});
        int maxInformedTime = 0;
        
        while(!q.isEmpty()){
            int[] curx = q.poll();
            int empl = curx[0], inft = curx[1];
            maxInformedTime = Math.max(maxInformedTime, inft);

            if(!graph.containsKey(empl)) continue;
            for(int dirReport: graph.get(empl))
                q.offer(new int[]{dirReport, inft + informTime[empl]});
        }
        
        return maxInformedTime;
    }
}