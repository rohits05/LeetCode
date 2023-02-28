class Solution {
    public boolean rotateString(String s, String goal) {
//         if(s.length() != goal.length()) return false;
        
//         StringBuilder st = new StringBuilder(s);
//         st.append(s);
//         if(st.toString().contains(goal)) return true;
        
//         return false;
        
        return ((s.length() == goal.length()) &&  (s+s).contains(goal));
    }
}