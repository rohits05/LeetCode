class Solution {
    int set[];
    private int findParent(int u){
        if(set[u] == u) return u;
        return set[u] = findParent(set[u]);
    }
    
    private void union(int a, int b){
        int p1 = findParent(a), p2 = findParent(b);
        if(p1 != p2) set[b] = p1;
        set[p2] = p1;
    }
    
    public int minCostConnectPoints(int[][] points) {
        set = new int[points.length];
        int n =points.length, res =0, cnt =0;
        
        for(int i=0; i<set.length; i++) set[i] = i;
        Queue<int[]> que = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++)
                que.offer(new int[]{i, j, Math.abs(points[i][0] - points[j][0]) 
              + Math.abs(points[i][1] - points[j][1])});
        }
        
        while(!que.isEmpty()){
            if(cnt == n-1) break;
            int[] coor = que.poll();
            int a = coor[0], b = coor[1], price = coor[2];
            if(findParent(a) != findParent(b)){
                union(a, b);
                cnt ++;
                res += price;
            }
        }
        
        return res;
    }
}