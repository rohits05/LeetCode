class Solution {
    public boolean backspaceCompare(String s, String t) {
        if(s == null || t == null)  return s == t;
        
        int m = s.length(), n = t.length();
        int i = m - 1, j = n - 1;
        int count1 = 0, count2 = 0;
        
        while(i >= 0 || j >= 0){
            while(i >= 0 && (s.charAt(i) == '#' || count1 > 0)){
                if(s.charAt(i) == '#')  count1++;
                else  count1--;
                i--;
            }
            while(j >= 0 && (t.charAt(j) == '#' || count2 > 0)){
                if(t.charAt(j) == '#')  count2++;
                else  count2--;
                j--;
            }
            
            if(i >= 0 && j >= 0 && s.charAt(i) == t.charAt(j)){
                i--; j--;
            }else return i == -1 && j == -1;
        }
        return true;
    }  
}