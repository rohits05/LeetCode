class Solution {
    public int longestPalindrome(String s) {
        int char_cnts[] =  new int[128];
        int res = 0;
        
        for(char c: s.toCharArray()) char_cnts[c]++;
        
        for(Integer cnt: char_cnts){
            res += cnt/2 * 2;
            if(res%2 == 0 && cnt%2 ==1) res += 1; 
        }
        return res;
    }
}