class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int n1 = nums1.length, n2 = nums2.length;
        List<List<Integer>> result = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] + a[1] - b[0] - b[1]);

        for(int i=0; i<n1 && i<k; i++) pq.add(new int[]{nums1[i], nums2[0], 0});

        while(k-- > 0 && !pq.isEmpty()){
            int curr[] = pq.poll();
            result.add(Arrays.asList(curr[0], curr[1]));
            if(curr[2] == n2-1) continue;

            pq.add(new int[]{curr[0], nums2[curr[2]+1], curr[2]+1});
        }

        return result;
    }
}