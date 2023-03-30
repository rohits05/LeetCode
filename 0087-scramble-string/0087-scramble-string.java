class Solution {
    public boolean isScramble(String s1, String s2) {
        return solve(s1, s2);
    }

    Map<String, Boolean> map = new HashMap();
    private boolean solve(String s1, String s2) {
        if(s1.equals(s2)) return true;
        if(s1.length() != s2.length()) return false;
        
        if(s1.length() <= 1) return false;
        
        int n = s1.length();
        boolean check = false;
        String key = s1 + "*" + s2;

        if(map.containsKey(key)) return map.get(key);

        for(int i=1; i<n; i++){
            boolean unswap = solve(s1.substring(0, i), 
            s2.substring(0, i)) && solve(s1.substring(i), 
            s2.substring(i));
            
            boolean swap = solve(s1.substring(0, i), 
            s2.substring(n - i)) && solve(s1.substring(i), 
            s2.substring(0, n - i));

            if(swap || unswap){
                check = true;
                break;
            }
        }
        
        map.put(key, check);
        return check;
    }
}