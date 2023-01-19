class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        Map<Character, Integer> map = new HashMap();
        for(char i: word1.toCharArray()) map.put(i, map.getOrDefault(i, 0) + 1);
        for(char i: word2.toCharArray()) map.put(i, map.getOrDefault(i, 0) - 1);

        for(var entry: map.entrySet()) {
            if(Math.abs(entry.getValue()) > 3) return false;
        }
        
        return true;
    }
}