class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();
    
        for(Integer i=0; i<s.length(); i++) {
            if(m1.put(s.charAt(i), i) != m2.put(t.charAt(i), i)) return false;
        }
        return true;
        
//         Map<Character, Character> hm = new HashMap<>();
        
//         for(int i=0; i<s.length(); i++){
//             if(hm.containsKey(s.charAt(i)))
//                 if(!hm.get(s.charAt(i)).equals(t.charAt(i))) return false; 
//             else
//                 if(hm.containsValue(t.charAt(i))) return false;
//             hm.put(s.charAt(i), t.charAt(i));
//         }
//         return true;
    }
}