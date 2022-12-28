class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> tmp = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i: piles) tmp.offer(i);
        while(k-- != 0){
            int val = tmp.poll();
            int remove = (int) Math.floor(val/2);
            tmp.offer(val - remove);
        }
        
        int sum = 0;
        while(!tmp.isEmpty()) sum += tmp.poll();
        
        return sum;
    }
}