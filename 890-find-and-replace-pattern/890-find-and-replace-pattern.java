class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res= new LinkedList<>();
        
        for (String w: words) {
            int[] p= new int[26], s= new int[26];
            boolean same=true;
            for (int i=0; i<w.length(); i++) {
                if (s[w.charAt(i)-'a']!=p[pattern.charAt(i)-'a']) {
                    same=false;
                    break;
                } else {
                    s[w.charAt(i)-'a']=p[pattern.charAt(i)-'a']=i+1;
                }
            }
            if (same) 
                res.add(w);
        }
        return res;
    }
}