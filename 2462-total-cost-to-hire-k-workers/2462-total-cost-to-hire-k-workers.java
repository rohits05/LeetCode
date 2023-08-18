class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int n = costs.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if(a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];});
        
        for(int i=0; i<candidates; i++) pq.offer(new int[] {costs[i], 0});
        for(int i = Math.max(candidates, n - candidates); i<n; i++)
            pq.offer(new int[] {costs[i], 1});

        long ans = 0;
        int nextHead = candidates, nextTail = n-1-candidates;

        for(int i=0; i<k; i++){
            int[] curWorker = pq.poll();
            int curCost = curWorker[0], curSectionId = curWorker[1];
            ans += curCost;
            
            if(nextHead <= nextTail){
                if(curSectionId == 0){
                    pq.offer(new int[]{costs[nextHead], 0});
                    nextHead++;
                }else{
                    pq.offer(new int[]{costs[nextTail], 1});
                    nextTail--;
                }
            }
        }

        return ans;
    }
}