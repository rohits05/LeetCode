class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        int max = 0;
        
        for(String word: words){
            String flipped = "" + word.charAt(1) + word.charAt(0);
            if(map.containsKey(flipped)) {
                max += 4;
                map.put(flipped, map.get(flipped) - 1);
                if(map.get(flipped) == 0) map.remove(flipped);
            } else  map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for(int i=0; i<26; i++) {
            char current = (char) ('a' + i);
            if(map.getOrDefault("" + current + current, 0) > 0){
                max += 2;
                break;
            }
        }
        return max;
    }
}