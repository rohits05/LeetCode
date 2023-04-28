class Solution {
    public boolean isSubsequence(String s, String t) {
        List<Integer>[] idx = new List[256]; 
        int tn = t.length(), sn = s.length();
        
        for(int i=0; i<tn; i++) {
            if (idx[t.charAt(i)] == null)
                idx[t.charAt(i)] = new ArrayList<>();
            idx[t.charAt(i)].add(i);
        }
        
        int prev = 0;
        for(int i=0; i<sn; i++){
            if(idx[s.charAt(i)] == null) return false; 
            
            int j = Collections.binarySearch(idx[s.charAt(i)], prev);
            if(j < 0) j = -j - 1;
            if(j == idx[s.charAt(i)].size()) return false;
            prev = idx[s.charAt(i)].get(j) + 1;
        }
        
        return true;
    }
}