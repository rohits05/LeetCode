class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
        
        int res =0, n =s.length();
        for(int i=0, j=0; i<n; i++){
            if(mp.containsKey(s.charAt(i))) j = Math.max(j, mp.get(s.charAt(i)) + 1);
            mp.put(s.charAt(i), i);
            res = Math.max(res, i-j+1);
        }
        
        return res;
    }
}