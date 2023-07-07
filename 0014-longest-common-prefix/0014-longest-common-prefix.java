class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0], s2 = strs[strs.length-1];
        int n =s1.length(), i =0;
        
        while(i < n){
            if(s1.charAt(i) == s2.charAt(i)) i++;
            else break;
        }
        
        return i == 0 ? "" : s1.substring(0, i);
    }
}