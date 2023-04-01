class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<int[]>> adj = new ArrayList<>();
        for(int i=0; i<n; i++) adj.add(new ArrayList<>());
        
        for(int a[]: flights) adj.get(a[0]).add(new int[]{a[1],a[2]});

        int dis[] = new int[n];
        Arrays.fill(dis, (int)1e9);
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, src, 0});
        dis[src] = 0;
        
        while(!q.isEmpty()){
            int a[] = q.poll();
            if(a[0] > k) {
                if(a[2] < dis[a[1]]) dis[a[1]] = a[2];
                continue;
            }
            
            for(int child[]: adj.get(a[1]) ){
                if(dis[child[0]] > a[2] + child[1]){
                    dis[child[0]] = a[2] + child[1];
                    q.add(new int[]{a[0]+1, child[0], dis[child[0]]});
                }
            }
        }
        
        return dis[dst] == (int)1e9 ? -1 : dis[dst];
    }
}