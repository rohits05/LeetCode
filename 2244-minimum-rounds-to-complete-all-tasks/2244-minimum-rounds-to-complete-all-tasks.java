class Solution {
    public int minimumRounds(int[] tasks) {
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int items: tasks) 
            map.put(items, map.getOrDefault(items, 0) + 1);
        
        int cnt = 0;
        for (int key: map.keySet()){
            int value = map.get(key);
            if(value == 1) return -1;
            else if(value == 2) cnt += 1;
            else if(value%3 == 0) cnt += value / 3;
            else cnt += value / 3+1;
        }
        return cnt; 
    }
}