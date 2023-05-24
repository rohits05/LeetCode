class Solution {
    class Pair {
        private Long first, second;

        Pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }
    
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        Pair[] vp = new Pair[n];
        
        for(int i=0; i<n; i++) vp[i] = new Pair(nums2[i], nums1[i]);
        Arrays.sort(vp, Comparator.comparing(a -> a.first));
        
        long ans =0, sum =0;
        PriorityQueue<Long> pq = new PriorityQueue<Long>();
        
        for(int i=n-1; i>=0; i--){
            if(pq.size() == k - 1)
                ans = Math.max(ans, (sum + vp[i].second) * vp[i].first);
            
            sum += vp[i].second;
            pq.add(vp[i].second);
            if(pq.size() >= k) sum -= pq.poll();
        }
        
        return ans;
    }
}