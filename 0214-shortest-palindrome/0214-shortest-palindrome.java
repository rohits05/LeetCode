class Solution {
    // KMP -ALOGO!!
    public String shortestPalindrome(String s) {
        String r =  new StringBuilder(s).reverse().toString();
        String toParse = s + " " + r;
        int[] lps = new int[toParse.length() + 1];
        lps[0] = -1; lps[1] = 0;
        createLPSArray(lps,toParse); 
        return r.substring(0, r.length()-lps[toParse.length()]) + s;
    }

    private void createLPSArray(int[] lps, String s) {
        int i =1, prefixLen =0;
        
        while(i<s.length()){
            if(s.charAt(i) == s.charAt(prefixLen)) lps[++i] = ++prefixLen;
            else if(prefixLen > 0) prefixLen = lps[prefixLen];
            else lps[++i] = 0;
        }
    }
}