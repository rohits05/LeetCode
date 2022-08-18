class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int a:arr) {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a,b)->(b-a));
        for(int value:map.values()) {
            priorityQueue.offer(value);
        }
        
        int sum = 0;
        int count = 0;
        while(sum < arr.length/2) {
            sum+=priorityQueue.poll();
            count++;
        }
        return count;
    }
}