class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int MOD = 1000000007;
        int[][] engineers = new int[n][2];

        for (int i = 0; i < n; i++)
            engineers[i] = new int[] {efficiency[i], speed[i]};
        
        Arrays.sort(engineers, (a, b) -> b[0] - a[0]); 
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a, b) -> a - b);       
        long result = Integer.MIN_VALUE, speedSum = 0;

        for (int[] engineer : engineers) {
            if (pq.size() == k) 
                speedSum -= pq.poll(); 
            pq.add(engineer[1]);
            speedSum = speedSum + engineer[1];
            result = Math.max(result, speedSum * engineer[0]);
        }

        return (int) (result % MOD);
    }
}