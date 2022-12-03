class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> cnt = new HashMap<>();
        for(char c: s.toCharArray()) cnt.put(c, cnt.getOrDefault(c, 0) + 1);
        
        PriorityQueue<Character> heap = new PriorityQueue<>((a, b) -> (cnt.get(b) - cnt.get(a)));
        heap.addAll(cnt.keySet());
        
        StringBuilder sb = new StringBuilder(); 
        while(!heap.isEmpty()){
            char c = heap.poll();
            for(int i=0; i<cnt.get(c); i++) sb.append(c);
        }
        return sb.toString();
    }
}