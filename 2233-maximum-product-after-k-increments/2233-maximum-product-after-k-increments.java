class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num: nums) pq.add(num);
        
        while(k>0){
            int top = pq.poll();
            pq.add(top+1);
			k--;
        }

        long res = 1;
        while(!pq.isEmpty()) res = (res * pq.poll()) % 1000000007;

        return (int)res;
    }
}