class Solution {
    public int countBinarySubstrings(String s) {
        int curr =1, pre =0, cnt =0;
        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i) == s.charAt(i - 1)) curr++;
            else { pre = curr;  curr = 1; }
            if(pre >= curr) cnt++;
        }
        return cnt;   
    }
}