class Solution {
    public boolean isIsomorphic(String s, String t) {
//         Map<Character, Integer> m1 = new HashMap<>();
//         Map<Character, Integer> m2 = new HashMap<>();
    
//         for(Integer i=0; i<s.length(); i++) {
//             if(m1.put(s.charAt(i), i) != m2.put(t.charAt(i), i)) return false;
//         }
//         return true;
        
        // Optimized!!
        // int n1 = s.length(), n2 = t.length();
        // if(n1 != n2) return false;
        // if(n1 == 1) return true;
        
        Map<Character, Character> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) != t.charAt(i))
                return false;
            }
            else{
                if(map.containsValue(t.charAt(i))) return false;
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        
       return true;
    }
}