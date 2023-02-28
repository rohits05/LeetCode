class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> l = new ArrayList<String>();
        for(int i=0; i<words.length; i++) l.add(words[i]);
        
        for(int i=1; i<l.size(); i++){
            if(isAna(l.get(i), l.get(i-1))){ l.remove(i); i--; }
            continue;
        }
        
        return l;        
    }
    
    boolean isAna(String s,String t){
        if(s.length() != t.length()) return false;
        else{
            int[] cnt = new int[26];
            
            for(int i=0; i<s.length(); i++) cnt[s.charAt(i)-'a']++;
            for(int i=0; i<t.length(); i++) cnt[t.charAt(i)-'a']--;
            for(int i: cnt) if(i != 0) return false;
        }
        
        return true;
    }
}