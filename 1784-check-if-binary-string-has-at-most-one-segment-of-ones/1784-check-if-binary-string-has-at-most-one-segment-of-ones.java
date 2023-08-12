class Solution {
    public boolean checkOnesSegment(String s) {
        int n = s.length();
        boolean find = false, gap = false;
        
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '1') find = true;
            else if(s.charAt(i) == '0' && find) gap = true;
            if(s.charAt(i) == '1' && gap) return false;
        }
        
        return true;
    }
}