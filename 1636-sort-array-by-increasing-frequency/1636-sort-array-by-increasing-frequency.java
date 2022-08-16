class Solution {
    public int[] frequencySort(int[] nums) {
        if (nums == null || nums.length == 0)  return new int[0];
        
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Integer> minHeap = new PriorityQueue<>(
            (a, b) -> map.get(a) == map.get(b) ? b - a : map.get(a) - map.get(b)
        );
        int[] result = new int[nums.length];
        
        for (int each : nums) {
            map.put(each, map.getOrDefault(each, 0) + 1);
        }
        minHeap.addAll(map.keySet());
        
        int counter = 0;
        while (minHeap.isEmpty() == false) {
            int cur = minHeap.poll();
            int fre = map.get(cur);
            while (fre != 0) {
                result[counter++] = cur;
                fre--;
            }
        }
        return result;
    }
}