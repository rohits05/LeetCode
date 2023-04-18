class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int cnt =0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        for(int i=0; i<s1.length(); i++)
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);

        for(int i=0; i<s2.length(); i++)
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);

        if(map1.equals(map2)){
            for(int i=0; i<s1.length(); i++){
                if(s1.charAt(i) != s2.charAt(i)) cnt++;
            }
            if(cnt <= 2) return true;
        }
        
        return false;
    }
}