class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        Map<String, Integer> seen = new HashMap<>();
        int i =0;
        
        while(i + 10 <= s.length()){
            String sub = s.substring(i, i++ + 10);
            seen.put(sub, seen.getOrDefault(sub, 0)+ 1);
            
            if(seen.get(sub) == 2) res.add(sub);
        }
        return res;
    }
}