class Solution {
   public String smallestEquivalentString(String s1, String s2, String baseStr) 
    {
        int len = s1.length();
        List<Set<Character>> set = new ArrayList<>();
        int currSet = 1;
        int[] sets = new int[26];
        for(int i=0; i<len; i++){
            char c1 = s1.charAt(i), c2 = s2.charAt(i);
            if(c1==c2) continue;
            if(sets[c1-'a']==0 && sets[c2-'a']==0){
                Set<Character> newSet = new TreeSet<>();
                newSet.add(c1);
                newSet.add(c2);
                sets[c1-'a'] = currSet;
                sets[c2-'a'] = currSet;
                currSet++;
                set.add(newSet);
            }
            else if(sets[c1-'a'] == 0){
                Set<Character> curr = set.get(sets[c2-'a']-1);
                curr.add(c1);
                sets[c1-'a'] = sets[c2-'a'];
            }
            else if(sets[c2-'a'] == 0){
                Set<Character> curr = set.get(sets[c1-'a']-1);
                curr.add(c2);
                sets[c2-'a'] = sets[c1-'a'];
            }
            else if(sets[c2-'a'] != sets[c1-'a']){
                Set<Character> first = set.get(sets[c1-'a']-1);
                Set<Character> second = set.get(sets[c2-'a']-1);
                for(char cha: second){
                    first.add(cha);
                    sets[cha-'a'] = sets[c1-'a'];
                }
                second.clear();
            }
        }
        
        String ans = "";
        for(int i=0; i<baseStr.length(); i++){
            char ch = baseStr.charAt(i);
            int index = sets[ch-'a']-1;
            if(index<0) ans += ch;
            else ans += set.get(index).iterator().next();;
        }
        return ans; 
    }
}