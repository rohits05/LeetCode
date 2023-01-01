class Solution {
    public boolean wordPattern(String pattern, String s) {
        String words[] = s.split(" ");
        
        if(words.length != pattern.length()) return false;
        HashMap<Character, String> map = new HashMap();
        
        for(int i=0; i<pattern.length(); i++){
            char cnt = pattern.charAt(i);
            if(map.containsKey(cnt)){
                if(!map.get(cnt).equals(words[i])) return false;
            }else{
                if(map.containsValue(words[i])) return false;
                map.put(cnt, words[i]);
            }
        }
        return true;
    }
}